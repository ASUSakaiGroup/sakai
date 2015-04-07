function jstest(scores)
{
  console.log("jstest");
  console.log(scores);

  var categoryNumbersGrade = scores; // This is the array for how many students are in each category
  var studentLocationGrade = 8;

  var gradeData = {
    labels : ["0-59","60-64","65-69","70-74","75-79","80-84","85-89","90-94","95-100+"],
    datasets : [
      {
      label: "Grade",
      fillColor : "#48A497",
      strokeColor : "#000000",
      highlightFill: "#34A2C3",
      highlightStroke: "#000000",
      data : categoryNumbersGrade
      },
    ]
  }

  var canvas = document.getElementById('gradeGraph');
  var context = canvas.getContext('2d');
  context.clearRect( 0 , 0 , canvas.width, canvas.height);

  var gradeGraph = new Chart(context).Bar(gradeData); // gradeGraph is the graph itself

  gradeGraph.datasets[0].bars[0].fillColor = "red";
  gradeGraph.datasets[0].bars[0].highlightFill = "pink";

  gradeGraph.datasets[0].bars[studentLocationGrade].fillColor = "green";
  gradeGraph.datasets[0].bars[studentLocationGrade].highlightFill = "lightgreen";

  gradeGraph.update();
}

function jstest2(dates)
{
  console.log("jstest2");
  console.log(dates);

  var categoryNumbersDate = dates; // This is the array for how many students are in each category
  var studentLocationDate = 2;

  var dateData = {
    labels : ["1 Week", "1 Day", "Late"],
    datasets : [
      {
      label: "Date",
      fillColor : "#48A497",
      strokeColor : "#000000",
      highlightFill: "#34A2C3",
      highlightStroke: "#000000",
      data : categoryNumbersDate
      },
    ]
  }

  var canvas = document.getElementById('dateGraph');
  var context = canvas.getContext('2d');
  context.clearRect( 0 , 0 , canvas.width, canvas.height);

  var dateGraph = new Chart(context).Bar(dateData); // gradeGraph is the graph itself

  dateGraph.datasets[0].bars[0].fillColor = "red";
  dateGraph.datasets[0].bars[0].highlightFill = "pink";


  dateGraph.datasets[0].bars[studentLocationDate].fillColor = "green";
  dateGraph.datasets[0].bars[studentLocationDate].highlightFill = "lightgreen";

  dateGraph.update();
}
