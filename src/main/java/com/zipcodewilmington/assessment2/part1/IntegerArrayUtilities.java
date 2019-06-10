package com.zipcodewilmington.assessment2.part1;

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.IntStream;

public class IntegerArrayUtilities {
    public Boolean hasEvenLength(Integer[] array) {

        if((array.length % 2) ==0)

        return true;

        else{
            return false;
        }
    }

    public Integer[] range(int start, int stop) {

        int[] r = IntStream.rangeClosed(start, stop).toArray();
        Integer[] r2 = new Integer[r.length];

    for (int i =0; i < r.length; i++){

        r2[i]= (Integer)r[i];
    }

        return r2;
    }

    public Integer getSumOfFirstTwo(Integer[] array) {

       Integer sum = array[0] + array[1];

        return sum;
    }

    public Integer getProductOfFirstTwo(Integer[] array) {

        Integer prod = array[array.length -1] * array[array.length -2];

        return prod;
    }
}
