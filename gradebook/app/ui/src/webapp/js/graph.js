function show_graphs(scores, dates) {
  var graphArea = document.getElementById('graphArea');
  graphArea.innerHTML = '';
  graphArea.innerHTML = '<canvas id="gradeGraph" width="300" height="150"></canvas>';
  graphArea.innerHTML = graphArea.innerHTML + '<canvas id="dateGraph" width="300" height="150"></canvas>';

  createGradeGraph(scores);
  createDateGraph(dates);
}


function createGradeGraph(scores)
{
  console.log("createGradeGraph");
  console.log(scores);

  var categoryNumbersGrade = scores; // This is the array for how many students are in each category

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
  var gradeGraph = new Chart(context).Bar(gradeData); // gradeGraph is the graph itself

  gradeGraph.datasets[0].bars[0].fillColor = "red";
  gradeGraph.datasets[0].bars[0].highlightFill = "pink";

  gradeGraph.update();
}

function createDateGraph(dates)
{
  console.log("createDateGraph");
  console.log(dates);

  var categoryNumbersDate = dates; // This is the array for how many students are in each category

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
  var dateGraph = new Chart(context).Bar(dateData);

  dateGraph.datasets[2].bars[2].fillColor = "red";
  dateGraph.datasets[2].bars[2].highlightFill = "pink";

  dateGraph.update();
}
