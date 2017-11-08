'use strict';

function luoMäki(Kpiste, lisäPisteet) {
    return function(pituus) {
        let etäisyysKpisteestä = pituus - Kpiste;
        return 60 + (etäisyysKpisteestä * lisäPisteet)
    };
}

let normaaliLahti = luoMäki(75, 2);
console.log(normaaliLahti(93));
