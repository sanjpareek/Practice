package com.example.misc;

import java.util.Scanner;

/**
 * Created by sanjana on 26/6/17.
 */
public class CalculateGCD {
    private int divisor;
    private int dividend;
    int findGCD(int a, int b){
        if(a>b){
            divisor = b;
            dividend = a;
        }else{
            divisor = a;
            dividend = b;
        }
        int remainder = dividend % divisor;
        if(remainder == 0){
           return divisor;
        }
        return findGCD(divisor , remainder);
    }

    public static void main(String[] args){
        CalculateGCD calculateGCD = new CalculateGCD();
        calculateGCD.findGCD(180, 18);

    }
}
