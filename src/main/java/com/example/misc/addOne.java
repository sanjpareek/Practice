package com.example.misc;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by sanjana on 4/8/17.
 */
public class addOne {

    public static ArrayList addOne(ArrayList<Integer> a){
        int carry =1, r =0;
        ArrayList<Integer> b = new ArrayList<Integer>(10);
        for(int i = a.size()-1; i>=0; i--){
            int d = a.get(i);
            d +=  carry;
            carry = 0;
            if(d > 9){
                d = d%10;
                carry = 1;
            }
            b.add( d);
        }
        if(carry == 1){
            b.add(1);
        }
        Collections.reverse(b);
        int i = 0;
        while(b.get(i) == 0){
            b.remove(0);
        }
        return b;

    }
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(0);
        a.add(8);
//        a.add(0)
        a.add(9);
        addOne(a);
//        System.out.print(reverse(201));
    }
}
