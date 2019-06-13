package com.zipcodewilmington.assessment2.part2;

import com.j256.ormlite.stmt.query.In;

import javax.swing.*;
import java.util.List;
import java.util.*;
import java.lang.*;
import java.util.Comparator;
import java.util.Collections;

public class ListUtility {

    private List<Integer> utility = new ArrayList<Integer>();




    public Boolean add(int i) {



         return utility.add(i);

    }

    public Integer size() {

        return utility.size();
    }

    public List<Integer> getUnique() {

        Set<Integer> unique = new HashSet<>(utility);

        List<Integer> u=  new ArrayList<Integer>(unique);

        return u;


    }

    public String join() {

         String join= utility.toString().replace("[","").replace("]","");


        return join;
    }

    public Integer mostCommon() {


        int common = 0;
        int tempLast = 0;

        for (int i = 0; i < utility.size(); i++) {
            int c = utility.get(i);
            int tempCount = 0;

            for (int j = 0; j < utility.size(); j++) {

                if (c == utility.get(j)) {
                    tempCount++;
                }
            }
            if (tempCount > tempLast) {
                tempLast = tempCount;
                common = c;



            }
        }  return common;
    }

    public Boolean contains(Integer valueToAdd) {

        return utility.contains(valueToAdd);
    }

    private class FrequencyComparator {

        public FrequencyComparator(List<Integer> utility) {
        }
    }
}

