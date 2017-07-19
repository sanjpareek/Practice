package com.example.Assignments.Recursion;

/**
 * Created by sanjana on 13/7/17.
 */
public class Fibonacci {

    public static int printFibo(int n){
        int f1 = 0, f2=1;
        if(n<=2) return n-1;
        return(printFibo(n-1) + printFibo(n-2));
    }

    public static int getFiboDP(int n){
        int a[] = new int[n];
        a[0] = 0; a[1] = 1;
        for(int i=2;i<n;i++){
            a[i] = a[i-1] + a[i-2];
        }
        return a[n-1];
    }

    public static void main(String[] args){
        //0 1 1 2 3 5...
        System.out.println(printFibo(10));
        System.out.println(getFiboDP(10));

        // p(4) + p(3)
    }
}
