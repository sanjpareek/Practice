package com.example.Assignments;

/**
 * Created by sanjana on 10/7/17.
 */
public class MatrixPathsDP {
    private int numberOfPaths(int m, int n){
        int a[][] = new int[m][n];
        for(int i =0; i<n;i++){
            a[m-1][i] = 1;  //last row
        }
        for(int j = 0; j<m; j++){
            a[j][n-1] = 1; //last col
        }
        for(int i =m-2; i>=0;i--){
            for(int j = n-2; j>=0; j--){
                a[i][j] = a[i+1][j] + a[i][j+1];
            }
        }
        return a[0][0];
    }
    public static void main(String[] args){
        MatrixPathsDP matrixPathsDP = new MatrixPathsDP();
        System.out.print(matrixPathsDP.numberOfPaths(4,4));
    }
}
