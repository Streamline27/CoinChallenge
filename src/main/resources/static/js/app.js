
var app = angular.module('CoinChallenge', []);

app.controller('index-controller', function($scope, $http) {

    $scope.sum = "";
    $scope.splitSum = function() {
        $http.get('/api/split', {
            params : { sum : $scope.sum }
        })
            .success(function(data) {
                $scope.data = data;
            });
    };

    $scope.clear = function () {
      $scope.data = [];
    };

    $scope.toFormattedString = function (combination) {

        var s = "[ ";
        for (i = 0; i < combination.length; i++) {
            s += combination[i] + " ";
        }
        return s + "]";
    }

});
