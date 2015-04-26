#!/bin/bash

if [ "$(id -u)" != "0" ]; then
    echo "This script must be run as root" 1>&2
    exit 1
fi

echo setting up config...
cp sakai.properties ../config/configuration/bundles/src/bundle/org/sakaiproject/config/bundle/
echo done.

echo adding jbdc driver to tomcat...
cp mysql-connector-java-5.1.35-bin.jar $CATALINA_HOME/lib/
echo done.

echo adding database to mysql...
echo SQL username:
read USER

echo SQL password:
read PASS

mysql --user=$USER --password=$PASS << END_SQL

create database sakai default character set utf8; 

END_SQL
echo done.

echo building sakai...
cd ../master
mvn clean install
cd ..
mvn -Dsakai.demo=true clean install sakai:deploy -Dmaven.test.skip=true -Dmaven.tomcat.home=$CATALINA_HOME
echo done.

cd $CATALINA_HOME/bin

echo Starting Tomcat now, you should tail -f the logs.

sh catalina.sh start

end

