package com.example.misc;

/**
 * Created by sanjana on 26/6/17.
 */
public class CalculateGCD {
    private int divisor;
    private int dividend;
    void findGCD(int a, int b){
        if(a>b){
            divisor = b;
            dividend = a;
        }else{
            divisor = a;
            dividend = b;
        }
        int remainder = dividend % divisor;
        if(remainder == 0){
           System.out.print("GCD is  " +divisor);
           return;
        }
        findGCD(divisor , remainder);
    }

    public static void main(String[] args){
        CalculateGCD calculateGCD = new CalculateGCD();
        calculateGCD.findGCD(180, 18);
    }
}
