package com.example.misc;

import java.util.Arrays;

/**
 * Created by sanjana on 5/8/17.
 * Given a set of time intervals in any order,
 * merge all overlapping intervals into one and output
 * the result which should have only mutually exclusive intervals. Let the intervals be represented as pairs of integers for simplicity.


 */
public class mergeIntervals {

    public static void sort(int a[][]){
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][0] + " " + a[i][0]);
        }

    }

    public static void main(String[] args){
       int a[][] = {{2,4},
               {1,5}  };

        sort(a);
    }

}
