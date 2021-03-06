app.controller("ManagerCtrl",function(Manager,$scope){
           Manager.findAll().then(function(d) {
    $scope.managers = d;
  });
    
          });

app.controller('ModalInstanceCtrlManager', ['$scope','$http','$modalInstance', function($scope, $http,$modalInstance) {
  	$scope.manager={} ;
    $scope.inserer_manager = function () {
		 $http.post("http://localhost:8181/managers/save",$scope.manager)
    .success(function(response) {  console.log(response);console.log(JSON.stringify($scope.manager))});

    };

    $scope.cancel = function () {
      $modalInstance.dismiss('cancel');
    };
    $scope.ok = function () {
      $modalInstance.close($scope.selected.item);
    };

    $scope.cancel = function () {
      $modalInstance.dismiss('cancel');
    };
  }])
  ; 

  app.controller('ModalDemoCtrlManager', ['$http','$scope', '$modal', '$log', function($http,$scope, $modal, $log) {
    $scope.items = ['item1', 'item2', 'item3'];

    $scope.open = function (size) {
      var modalInstance = $modal.open({
        templateUrl: 'myModalContent.html',
        controller: 'ModalInstanceCtrlManager',
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