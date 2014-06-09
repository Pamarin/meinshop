/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var data = [
	{"id": 1, "artnr": "100", "artbez": "BMW M3", "preis":86000.00},
	{"id": 2, "artnr": "101", "artbez": "VW Golf", "preis":27000.00},
	{"id": 3, "artnr": "102", "artbez": "BMW M4 Gran Coupe", "preis":97000.00}
];

var app = angular.module('app', []);

app.controller("AppCtrl", function($http) {
	var app = this;
	$http.get("http://localhost:8080/artikel")
			.success(function (data) {
				app.artikel = data;
	})
})

app.get('/artikel', function(reg, res){
	res.send(data)
});