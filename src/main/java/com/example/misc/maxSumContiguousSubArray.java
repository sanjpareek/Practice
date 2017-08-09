package com.example.misc;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sanjana on 3/8/17.
 * exclude negative numbers
 */
public class maxSumContiguousSubArray {
    public static void maxset(ArrayList<Integer> a) {
        //1, 2, 5, -7, 2, 3
        int curr_sum = a.get(0);
        int max_sum = a.get(0);
        int start_index = 0; int end_index=0;
        int old_start_index = 0;
        for(int i =1; i<a.size(); i++){
            if(a.get(i) < 0){
                curr_sum = 0;
                start_index = i+1;
                continue;
            }
            curr_sum += a.get(i);
            if(curr_sum > max_sum){
                old_start_index = start_index;
                max_sum = curr_sum;
                end_index = i;
            }
        }
        for(int i = old_start_index; i<= end_index; i++){
            System.out.println(a.get(i));
        }
    }


    public static int maxSum(List<Integer> a) {
        int max_sum = a.get(0), curr_sum = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            curr_sum = max(a.get(i), curr_sum + a.get(i));
            max_sum = max(curr_sum, max_sum);
        }
        return max_sum;
    }
    public static int max(int a, int b){
        return a>b?a:b;
    }

    public static void main(String[] args){
        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();
        int[] b = {8,-19,5,-4,20};
        for(int i = 0 ; i < b.length ; i ++){
            Y.add(b[i]);
        }
        System.out.print(maxSum(Y));
    }
}
