
var app = angular.module('RunUsApp');

app.controller('RunnersCtrl',function($scope){
	
	$scope.runner = {};

    $scope.runners = [
	    {
	    	name: 'Bobby Joe',
	    	panId: '0000FECA1000CACA',
	    	currentRun:{
	    		id : 1,
	    		date : 1397490980837,
	    		isDone : false,
	    		averageSpeed : 3.3,
	    		speed :3.2
	    	},
	    	runs:
	    	[{
	    		id : 2,
	    		date : 1397480980837,
	    		averageSpeed : 3.3,
	    		speed :0
	    	},
	    	{
	    		id : 3,
	    		date : 1397490980000,
	    		isActive : false,
	    		averageSpeed : 3.3,
	    		speed : 0
	    	}],
	    },
	    {
	    	name : 'Jeremy James',
	    	panId : 'N00BFECA1000CACA',
	    	currentRun : {},
	    	runs : [],
    }];

    $scope.addRunner = function(){
    	$scope.runners.push($scope.runner);
    	$scope.runner = {};
    }

  });

