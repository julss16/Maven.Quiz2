package com.zipcodewilmington.assessment2.part2;

import java.util.List;
import java.util.*;

public class ListUtility {

    private List<Integer> list;

    public Boolean add(int i) {

        if (list.contains(i)) {
            return false;
        }
        list.add(i);

        if (list.contains(i)) {

        }return true;
    }

    public Integer size() {

        return null;
    }

    public List<Integer> getUnique() {

        return null;
    }

    public String join() {

        return null;
    }

    public Integer mostCommon() {

        return null;
    }

    public Boolean contains(Integer valueToAdd) {

        if (list.contains(valueToAdd)) {

            return true;

        } else {

            return false;
        }
    }
}
