var app = angular.module('RunUsApp');
app.directive("currentRun", function() {
  return {
    restrict: 'E',
    templateUrl: "runners/currentRun/current-run.html"
  };
});