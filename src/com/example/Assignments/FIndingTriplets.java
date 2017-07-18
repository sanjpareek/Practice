package com.example.Assignments;

/**
 * Created by sanjana on 11/7/17.
 */
public class FIndingTriplets {
    public static int findTriplets(int a[], int sum){
     int l, r, triplets=0;
        for(int i=0; i<a.length-2;i++) {
            l = i + 1;
            r = a.length - 1;
            while (l < r) {
                if (a[i] + a[l] + a[r] == sum) {
                    triplets++; l++; r--;
                } else if (a[i] + a[l] + a[r] < sum) {
                    l++;
                } else {
                    r--;
                }
            }
        }
     return triplets;
    }

    public static void main(String[] args){
        int a[] = {1, 4, 6, 8, 10,45};
        System.out.println(findTriplets(a,22));
    }
}
