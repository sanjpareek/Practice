package com.example.misc;

import java.util.Comparator;

/**
 * Created by sanjana on 9/8/17.
 */
public class PersonComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2){
            return p1.age - p2.age;
    }
}
