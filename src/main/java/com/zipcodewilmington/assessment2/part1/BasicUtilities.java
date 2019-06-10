package com.zipcodewilmington.assessment2.part1;

public class BasicUtilities {
    public Boolean isGreaterThan5(Integer value) {

        if (value >= 5) {

        } else {

            return false;
        }

        return true;
    }

    public Boolean isLessThan7(Integer value) {

        if (value <= 7) {

        } else {

            return false;
        }

        return true;
    }

    public Boolean isBetween5And7(Integer valueToEvaluate) {

        if (5 <= valueToEvaluate && valueToEvaluate <= 7) {

        } else {

            return false;
        }

        return true;
    }

    public Boolean startsWith(String string, Character character) {


        //char[] start = string.toCharArray();
        char c = string.charAt(0);
        //character.toUpperCase(' ');

         if (Character.isLowerCase(character)) {

            Character.toUpperCase(character);


        }if (character == c) {

            return true;

        }else {

        }
        return false;

    }
}
