package com.example.Assignments;

/**
 * Created by sanjana on 9/7/17.
 */
public class MatrixPaths {
    private int paths = 0;
    private int i =0, j=0;
    private int numberOfPaths(int m, int n){
        if(i == m-1 && j == n-1){
            //reached last cell
            return paths;
        }else if(i == m-1 || j == n-1){
            //number of paths is 1 in last row and last column
            paths += 1;
        }else{
            paths += 2; //from all other cells there are 2 paths available
        }
        return numberOfPaths(i+1, j) + numberOfPaths(i,j+1);
    }
    public static void main(String[] args){
        MatrixPaths matrixPaths = new MatrixPaths();
        int p =matrixPaths.numberOfPaths(4,4);
        System.out.print("Total : " + p);
    }
}
