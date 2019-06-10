package com.zipcodewilmington.assessment2.part2;

import java.util.HashMap;
import java.util.Map;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] m= new Integer[array1.length + array2.length];

    System.arraycopy(array1,0,m,0,array1.length);
    System.arraycopy(array2,0,m,array1.length,array2.length);


         return m;
    }

    public Integer[] rotate(Integer[] array, Integer index) {

        //int i= array.length;
        Integer[] r = new Integer[array.length];

        for (int i = 0; i < array.length; i++) {

            for (int j = index; j < array.length - 1; j++) {


                r[i] = array[j];

            }

        } return r;
    }

    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer[] n = new Integer[array1.length + array2.length];

        System.arraycopy(array1, 0, n, 0, array1.length);
        System.arraycopy(array2, 0, n, array1.length, array2.length);

        Map<Integer, Integer> map = new HashMap<>();
       // for (valueToEvaluate: n) {
            if (map.containsKey(valueToEvaluate)) {
                int occurence = map.get(valueToEvaluate);
                occurence++;
                map.put(valueToEvaluate, occurence);
            }


        return null;
    }



    public Integer mostCommon(Integer[] array) {

        return null;
    }
}
