package com.example.misc;

import java.util.*;


/**
 * Created by sanjana on 9/8/17.
 */
public class LargestNumberFromArray {

    public static void main(String[] args){
        int a[] = {67, 99, 4, 62, 9, 0};
        List<Integer> a1 = new ArrayList<Integer>();
        for(int i=0; i<a.length;i++){
            a1.add(a[i]);
        }
        Collections.sort(a1, new CompareNumbers());
        for(int i=0; i<a1.size();i++){
            System.out.print(a1.get(i));
        }
        System.out.println();

    }
}
