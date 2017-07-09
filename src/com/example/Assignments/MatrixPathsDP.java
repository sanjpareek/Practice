package com.example.Assignments;

/**
 * Created by sanjana on 10/7/17.
 */
public class MatrixPathsDP {
    private int numberOfPaths(int m, int n){
        int a[][] = new int[m-1][n-1];
        for(int i =0; i<m;i++){
            for(int j = 0; j<n; j++){
                a[0][j] = 1;
                a[i][n-1] = 1;
            }
        }
        for(int i =0; i<m;i++){
            for(int j = 0; j<n; j++){
                a[i][j] = a[i+1][j] + a[i][j+1];
            }
        }
        return a[m-1][n-1];
    }
    public static void main(String[] args){
        MatrixPathsDP matrixPathsDP = new MatrixPathsDP();
        System.out.print(matrixPathsDP.numberOfPaths(4,4));
    }
}
