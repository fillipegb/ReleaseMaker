app.controller('releaseController', function($scope) {
    $scope.headingTitle = "Criar Release";
    $scope.rc = {sourceBranch: 'teste', name: 'guest', releases: 'visitor'};
    $scope.submit = function() {
    	$scope.rc = {sourceBranch: 'passou', name: 'aqui', releases: 'certo'};
      };
});