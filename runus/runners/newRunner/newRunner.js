var app = angular.module('RunUsApp');
app.directive("addRunner", function() {
  return {
    restrict: 'E',
    templateUrl: "runners/newRunner/new-runner.html",
    controller: "RunnersCtrl"
  };
});