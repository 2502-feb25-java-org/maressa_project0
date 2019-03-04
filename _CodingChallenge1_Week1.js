
'use strict';
var i;

function isValid(int i){
    if (i<0 || i>1000)
        throw IllegalStateException();
}

function wordGame(int i){
    isValid(i);

    if(i%3==0 && i%5==0){
        return "fizzbuzz";
    }
    else if (i%3==0){
        return "fizz";
    }
    else if (i%5==0){
        return "buzz"
    }
    else{
     return i.toString();
    }
}
