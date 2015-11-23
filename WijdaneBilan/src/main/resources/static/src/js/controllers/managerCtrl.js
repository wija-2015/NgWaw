app.controller("ManagerCtrl",function(Manager,$scope){
           Manager.findAll().then(function(d) {
    $scope.managers = d;
  });
    
          });