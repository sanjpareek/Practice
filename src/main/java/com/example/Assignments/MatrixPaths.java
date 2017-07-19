package com.example.Assignments;

/**
 * Created by sanjana on 9/7/17.
 */
public class MatrixPaths {
    //Using bottom-up approach
    //Since robot cannot traverse the same path twice, he can move only left and top
    private int numberOfPaths(int m, int n){
         if(m == 1 || n == 1){
            //number of paths is 1 in first row and first column
            return 1;
        }
        return numberOfPaths(m-1, n) + numberOfPaths(m,n-1);
    }
    public static void main(String[] args){
        MatrixPaths matrixPaths = new MatrixPaths();
        int p =matrixPaths.numberOfPaths(4,4);
        System.out.print("Total number of paths: " + p);
    }
}
