angular.module('RunUsApp')
	.config(function($routeProvider){
		$routeProvider
			.when("/runners", {
				templateUrl: "runners/runners.html", 
				controller: "RunnersCtrl"
			});
	});