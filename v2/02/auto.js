'use strict';

const Auto = (function(){
    
    const suojatut = new WeakMap();
    
    let tankki;
    
    class Auto {
        constructor() {
            tankki: 0;
            suojatut.set(this, {matkamittari: 0});
        }
        
        getMatkamittari() {return suojatut.get(this).matkamittari;}
        
        getTankki() {return tankki;}
        
        lisääBensa(bensa) {tankki = bensa;}
        
        aja(km) {tankki -= km * 0.05; suojatut.set(this, {matkamittari: km})};
    }
    return Auto;
})();

const auto1 = new Auto();
auto1.lisääBensa(40);
auto1.aja(100); //bensaa pitäisi olla kulunut 5 l (35l jäljellä) ja matkamittariin 100km lisää
console.log(auto1.getTankki());
console.log(auto1.getMatkamittari());
