package com.example.Assignments.DynamicProg;

import org.junit.Test;
import org.mockito.Mockito;

import java.sql.DriverManager;

/**
 * Created by sanjana on 18/7/17.
 */
public class MaxContSumArray {

    public int getMaxContSum(int[] a){
        int maxSoFar =0;
        int sum = 0;
        for(int i =0; i<a.length; i++){
            sum += a[i];
            if(sum > maxSoFar)
                maxSoFar = sum;
            if(sum<0){
                maxSoFar = 0;
                sum = 0;
            }

        }
        return maxSoFar;

    }
}
