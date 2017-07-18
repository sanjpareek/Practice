package com.example.Assignments;

import java.util.HashMap;

/**
 * Created by sanjana on 11/7/17.
 * Given an array a[], find three indices (triplets) i,j,k such that:
 1. i < j < k 2. a[i] < a[j] < a[k] 3. a[i] + a[j] + a[k] <= t , where t is a given sum.
    Array is not necessarily sorted. Return number of triplets
 */
public class FindingPairs {

    private int findPairs(int a[], int sum){
        int pairs = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<a.length;i++){
                map.put(a[i],0);
        }
        for(int i=0; i<a.length; i++){
            if(map.containsKey(sum-a[i]) && map.get(sum-a[i]) == 0){
                pairs++;
            }
            if(sum-a[i] == a[i]){
                 pairs--;
            }
        }
        return pairs/2;
    }

    public static void main(String[] args){
        int a[] = {2,3,4,4,6,8,9};
        FindingPairs tripletsProblem = new FindingPairs();
        System.out.println(tripletsProblem.findPairs(a, 12));
    }
}
