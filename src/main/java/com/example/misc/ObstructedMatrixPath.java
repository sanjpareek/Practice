package com.example.misc;

/**
 * Created by sanjana on 8/8/17.
 */
public class ObstructedMatrixPath {

    public static void paths(int m , int n, int a[][]){
       int p[][] = new int[m][n];
        if(m==0)
            return ;
        if(n==0)
            return ;
        for(int i = 0 ; i<n; i++){
            if(a[0][i] == -1)
                break;
            p[0][i] = 1;

        }

    }
}
