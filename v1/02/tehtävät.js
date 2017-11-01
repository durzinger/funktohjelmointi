'use strict'

let vertaa = function (a, b) {
    if (a > b) {
        return 1;
    } else if (a < b) {
        return -1;
    } else {
        return 0;
    }
}

let tulos = vertaa(4,2);

console.log(tulos);

var hki2015 = [ -0.9, 0.9, 2.4, 5.3, 9.3, 13.3, 16.4, 17.5, 13.7, 6.4, 5.6, 3.3];


var hki2016 = [-8.8, 0.3, 0.9, 4.8, 13.8, 15.3, 17.8, 16.4, 13.3, 5.6, 0.0, 0.2];



function vertaaLämpötila(vertaa, lista1, lista2) {
    let sum = 0;
    
    for (let i = 0; i < lista1.length; i++) {
        if (vertaa(lista1[i], lista2[i]) == 1) {
            sum++;
        }
    }
    
    return sum;
}

console.log(vertaaLämpötila(vertaa, hki2016, hki2015));