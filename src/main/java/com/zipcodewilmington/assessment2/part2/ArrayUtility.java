package com.zipcodewilmington.assessment2.part2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayUtility {
    public Integer[] merge(Integer[] array1, Integer[] array2) {

        Integer[] m= new Integer[array1.length + array2.length];

    System.arraycopy(array1,0,m,0,array1.length);
    System.arraycopy(array2,0,m,array1.length,array2.length);


         return m;
    }

    //1--> 0|  3-->0,  (0,3),(1,4),(2,0), (3,1)(4,2)

    public Integer[] rotate(Integer[] array, Integer index) {

        Integer[] temp= new Integer[array.length];
        for (int i =0; i < array.length; i++){

            temp[i]= array[(i + index) % array.length];

        }
        for (int i=0; i < array.length; i++){
            array[i]= temp[i];
        }


        return temp;
    }



    public Integer countOccurrence(Integer[] array1, Integer[] array2, Integer valueToEvaluate) {

        Integer[] n = new Integer[array1.length + array2.length];

        System.arraycopy(array1, 0, n, 0, array1.length);
        System.arraycopy(array2, 0, n, array1.length, array2.length);

        int counter =0;

        for (int i=0; i <n.length; i++){

            if (valueToEvaluate == n[i]){
                counter++;
            }
        }


        return counter;
    }



    public Integer mostCommon(Integer[] array) {

        int common = 0;
        int tempLast =0;

        for (int i=0; i < array.length; i++){
            int c = array[i];
            int tempCount=0;

            for (int j=0; j< array.length; j++) {

                if (c == array[j]) {
                    tempCount++;
                }
            }
            if (tempCount > tempLast){
                tempLast = tempCount;
                common= c;



        }

    } return common;

    }
}
