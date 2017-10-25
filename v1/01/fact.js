function fact(n) {
// triviaalitapaus
  if (n === 0) {
    return 1;
  }
 // perussilmukka
  return n * fact(n - 1);
}
var tulos = fact(4);
console.log(tulos);

function onkoPalindromi(sana) {
    if (sana.length <= 2) {
        return true;
    } else if (sana.charAt(0) != sana.charAt(sana.length -1)) {
        return false;
    } else {
        return onkoPalindromi(sana.slice(1, -1));
    }
}

console.log(onkoPalindromi("saippuakauppias"));
console.log(onkoPalindromi("jäätelö"));
console.log(onkoPalindromi("saiöppukauppias"));


function syt(p, q) {
  if (q === 0) {
    return p;
  } else {
    return syt(q, p % q);
  }
}

console.log(syt(48, 18));
console.log(syt(35, 18));

function potenssiinKorotus(p, q) {
  if (q === 0) {
    return 1;
  } else {
    return p * potenssiinKorotus(p, q - 1);
  }
}

console.log(potenssiinKorotus(3, 3));

function kääntö(numlist,newlist) {
  if(newlist==null){
    newlist=[];
  }
  
  if (numlist.length==0){
    return newlist;
  }
  
  newlist.push(numlist.pop());
  return kääntö(numlist,newlist);
}

let test=[1,2,3,4,5,6,7,8,9];
console.log(kääntö(test));