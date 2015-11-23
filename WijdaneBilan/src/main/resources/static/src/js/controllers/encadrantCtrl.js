app.controller("EncadrantCtrl",function(Encadrant,$scope){
           Encadrant.findAll().then(function(d) {
    $scope.encadrants = d;
  });
    
          });