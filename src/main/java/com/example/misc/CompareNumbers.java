package com.example.misc;

import java.util.Comparator;

/**
 * Created by sanjana on 9/8/17.
 */
public class CompareNumbers implements Comparator<Integer>{

    public int compare(Integer a, Integer b) {
        String a1 = b.toString() + a.toString();
        String a2 = a.toString() + b.toString();
        return a1.compareTo(a2);


    }
}
