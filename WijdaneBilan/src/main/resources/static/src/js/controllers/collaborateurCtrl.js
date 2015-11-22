app.controller("CollaborateurCtrl",function(Collaborateur,$scope){
           Collaborateur.findAll().then(function(d) {
    $scope.collaborateurs = d;
  });
    
          });