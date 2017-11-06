'use strict';


// tehtävä 1

var toCelcius = f => (5/9) * (f-32);

var area = radius => Math.PI * radius * radius; 

console.log(toCelcius(100));

console.log(area(40));


// tehtävä 4

var v1 = [-0.9, 0.9, 2.4, 5.3, 9.3, 13.3, 16.4, 17.5, 13.7, 6.4, 5.6, 3.3]; 
var v2 = [-8.8, 0.3, 0.9, 4.8, 13.8, 15.3, 17.8, 16.4, 13.3, 5.6, 0.0, 0.2];

var vuodet = [];

for (var i = 0; i < v1.length; i++) {
    vuodet.push((v1[i] + v2[i])/2);
}

console.log(vuodet.filter(x => x >= 0));