package com.example.misc;

import java.util.ArrayList;

/**
 * Created by sanjana on 4/8/17.
 *
 * You are given an array of N integers, A1, A2 ,…, AN. Return maximum value of f(i, j) for all 1 ≤ i, j ≤ N.
 f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.
 |A[i] - A[j]| + |i - j| = -(A[i] - A[j]) + |i - j|

 -|A[i] - A[j]| - |i - j|
 |A[i] - A[j]| - |i - j|
 |A[i] - A[j]| + |i - j|


 A[i] + A[j] + i -j = A[i] + i - (-A[j] + j)
 -A[i] + A[j] - i + j =  (A[j] + j) -(A[i] + i)
 A[i] - A[j] - i + j = (A[i] - i) -(A[j] - j)
                       (A[i] + i) - (-A[j] - j)

 A[i] + i, A[i] - i, -A[i] + i, -A[i] - i
 */
public class maxValue {
    public static int maxArr(ArrayList<Integer> A) {
        int min1=0, min2=0, min3=0, min4 = 0;
        int max1 =0, max2 = 0, max3=0, max4 = 0;
        int result  = 0;
        for(int i = 0; i< A.size() ; i++){
            max1 = max(max1, A.get(i) + i);
            max2 = max(max2, A.get(i) - i);
            max3 = max(max3, -A.get(i)+ i);
            max4 = max(max4, -A.get(i) - i);
        }
        for(int i = 0; i< A.size() ; i++){
            min1 = min(min1, A.get(i) + i);
            min2 = min(min2, A.get(i) - i);
            min3 = min(min3, -A.get(i)+ i);
            min4 = min(min4, -A.get(i) - i);
        }
        System.out.println(max1+  " " + max2+  " " + max3+  " "+ max4+  " " );
        System.out.println(min1+  " " + min2+  " " + min3+  " "+ min4+  " " );
        result = max(result, max1 - min1);
        result = max(result, max2 - min2);
        result = max(result,max3 - min3);
        result = max(result,max4 - min4);

        return result;
    }

    private static int min(int a, int b) {
        return a<b?a:b;
    }

    private static int max(int a, int b) {
        return a>b?a:b;
    }

    public static void main(String[] args){
        ArrayList<Integer> Y = new ArrayList<Integer>();
        int[] b = {30, 74, 15, 49, 88, 77, 46, 48, 36, 62};
        for(int i = 0 ; i < b.length ; i ++){
            Y.add(b[i]);
        }
        System.out.print(maxArr(Y));
    }
}
