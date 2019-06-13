package com.zipcodewilmington.assessment2.part3;

import java.util.Comparator;


/** Create a SpeedComparator class. The class should implements Comparator<Animal>
 Implements the int compare(Animal animal1, Animal animal2) method
 If animal1's and animal2's speed are the same, then return 0
 If animal1's speed is greater than animal2 speed, then return a negative number
 If animal1's speed is less than animal2 speed, then return a positive number */


public class SpeedComparator implements Comparator<Animal> {



    public int compare(Animal Animal1, Animal Animal2) {


        if (Animal1.getSpeed() == Animal2.getSpeed()) {



                return 0;

        }else if (Animal1.getSpeed() > Animal2.getSpeed()){



            return Animal2.getSpeed()- Animal1.getSpeed();


        }else if (Animal1.getSpeed() < Animal2.getSpeed()){


        } return Animal2.getSpeed() - Animal1.getSpeed();
    }
}









