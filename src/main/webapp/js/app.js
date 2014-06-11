/**
 *
 * @author Jan Krieghoff
 */

var app = angular.module('myApp', []);

function Artikel ($scope, $http) {

    $scope.listeArtikel = null;

    $http.get('http://localhost:8080/meinshop-1.0/rest/artikel/')
         .success(function (data) {
             $scope.listeArtikel = data;
         })
         .error(function (data, status, headers, config) {
             //  TODO: Fehlerbehandlung
         });
}