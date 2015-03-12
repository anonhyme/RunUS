var app = angular.module('RunUsApp');

app.controller('TabsCtrl',function(){
	
	this.tab = 1;

	this.isSet = function(checkTab) {
	  return this.tab === checkTab;
	};

	this.setTab = function(activeTab) {
	  this.tab = activeTab;
	};

});