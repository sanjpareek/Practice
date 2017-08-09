package com.example.misc;

/**
 * Created by sanjana on 8/8/17.
 */
public class NQueensProblem {

    int size = 0;

    public NQueensProblem(int i) {
        this.size = i;
    }

    public static boolean isSafe(int m, int n, int a[][], int size){
        for(int i =0; i<size ; i++){
            if(a[m][i] ==1 || a[i][n] == 1 )
                return false;
        }

        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(m+n == i+j && a[i][j] == 1)
                    return false;
                if(m-n == i-j && a[i][j] == 1)
                    return false;
            }
        }
        return true;
    }


    public static boolean placeQueens(int n, int board[][],  int size){
        if(n == 0)
            return true;
        for(int i =0; i<size; i++){
            for (int j=0; j<size; j++){
                if(isSafe(i,j,board, size)) {
                    board[i][j] = 1;
                    if (placeQueens(n - 1, board,  size) == true)
                    {
                        return true;
                    }else {
                        board[i][j] = 0;
                    }

                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        NQueensProblem nQueensProblem = new NQueensProblem(8);

        int board[][] = {{0, 0, 0,0, 0, 0,0,0},
                {0, 0, 0,0, 0, 0,0,0},
                {0, 0, 0,0, 0, 0,0,0},
                {0, 0, 0,0, 0, 0,0,0},
                {0, 0, 0,0, 0, 0,0,0},
                {0, 0, 0,0, 0, 0,0,0},
                {0, 0, 0,0, 0, 0,0,0},
                {0, 0, 0,0, 0, 0,0,0},
        };
        if(placeQueens(8, board, nQueensProblem.size) == false){
            System.out.print("No solution found");
            return;
        }
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
                System.out.print(" " + board[i][j]
                        + " ");
            System.out.println();
        }
    }
}
