app.controller("CollaborateurCtrl",function(Collaborateur,$scope){
           Collaborateur.findAll().then(function(d) {
    $scope.collaborateurs = d;
  });
    
          });

app.controller('ModalInstanceCtrlCollab', ['$scope','$http','$modalInstance', function($scope, $http,$modalInstance) {
  	$scope.collaborateur={} ;
    $scope.inserer_collab = function () {
		 $http.post("http://localhost:8181/collaborateurs/save",$scope.collaborateur)
    .success(function(response) {  console.log(response);console.log(JSON.stringify($scope.collaborateur))});

    };

    $scope.cancel = function () {
      $modalInstance.dismiss('cancel');
    };
    $scope.ok = function () {
      $modalInstance.close($scope.selected.item);
    };

  }])
  ; 

  app.controller('ModalDemoCtrlCollab', ['$http','$scope', '$modal', '$log', function($http,$scope, $modal, $log) {
    $scope.items = ['item1', 'item2', 'item3'];

    $scope.open = function (size) {
      var modalInstance = $modal.open({
        templateUrl: 'myModalContent.html',
        controller: 'ModalInstanceCtrlCollab',
        size: size,
        resolve: {
          items: function () {
            return $scope.items;
          }
        }
      });

      modalInstance.result.then(function (selectedItem) {
        $scope.selected = selectedItem;
      }, function () {
        $log.info('Modal dismissed at: ' + new Date());
      });
    };
  }])
  ; 