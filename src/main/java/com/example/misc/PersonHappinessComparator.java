package com.example.misc;

import java.util.Comparator;

/**
 * Created by sanjana on 9/8/17.
 */
public class PersonHappinessComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2){
        return p2.happinessIndex - p1.happinessIndex;
    }
}
