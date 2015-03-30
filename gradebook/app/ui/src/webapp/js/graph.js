function jstest()
{
  var categoryNumbersGrade = [1,2,3,4,5,6,7,8,9]; // This is the array for how many students are in each category
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

  var ctx = document.getElementById('gradeGraph').getContext('2d');
  var gradeGraph = new Chart(ctx).Bar(gradeData); // gradeGraph is the graph itself
  gradeGraph.datasets[0].bars[0].fillColor = "red";
  gradeGraph.datasets[0].bars[0].highlightFill = "pink";
  gradeGraph.datasets[0].bars[studentLocationGrade].fillColor = "green";
  gradeGraph.datasets[0].bars[studentLocationGrade].highlightFill = "lightgreen";
  gradeGraph.update();
}

function jstest2()
{
  var categoryNumbersGrade = [9,8,7,6,5,4,3,2,1]; // This is the array for how many students are in each category
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

  var ctx = document.getElementById('gradeGraph').getContext('2d');
  var gradeGraph = new Chart(ctx).Bar(gradeData); // gradeGraph is the graph itself
  gradeGraph.datasets[0].bars[0].fillColor = "red";
  gradeGraph.datasets[0].bars[0].highlightFill = "pink";
  gradeGraph.datasets[0].bars[studentLocationGrade].fillColor = "green";
  gradeGraph.datasets[0].bars[studentLocationGrade].highlightFill = "lightgreen";
  gradeGraph.update();
}
