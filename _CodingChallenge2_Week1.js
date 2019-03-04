'use strict';

challenge.sort = function(array){
    var x = [];
    for (i = 0; i < array.length; i++) { 
        for (j = 0; j < array.length; j++) { 
		    if (array[j] > array[j+1]) {
		     x = array[j];
		    array[j] = array[j + 1];
		    array[j + 1] = x;
		    }
	    }
    }
}