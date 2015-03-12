var app = angular.module('RunUsApp');
app.directive("runnersTabs", function() {
  return {
    restrict: 'E',
    templateUrl: "runners/tabs/tabs.html",
    controller: "TabsCtrl",
    controllerAs: "tab"
  };
});