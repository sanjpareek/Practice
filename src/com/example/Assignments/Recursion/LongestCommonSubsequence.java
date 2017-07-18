package com.example.Assignments.Recursion;

/**
 * Created by sanjana on 13/7/17.
 *
 * ARTIHBFRR & TYUIOPOHLKBFR => TIHBFR
 */
public class LongestCommonSubsequence {

    public static int LCSrec(String s1, String s2, int m, int n) {
        if(m==0 || n==0)
            return 0;
        if(s1.charAt(m-1) == s2.charAt(n-1)){
            return 1 + LCSrec(s1, s2, m-1, n-1);
        } else {
            return max(LCSrec(s1, s2, m-1, n) , LCSrec(s1, s2, m, n-1));
        }
    }

    public static int LCSdp(String s1, String s2, int m, int n){
        int a[][] = new int[m+1][n+1];
        for(int i = 0; i<=m ; i++){
            for(int j =0; j <=n; j++){
                if(i==0 || j == 0){
                    a[i][j] = 0;
                }else if(s1.charAt(i-1) == s2.charAt(j-1)){
                    a[i][j] = 1 + a[i-1][j-1];
                } else {
                    a[i][j] = max(a[i-1][j] , a[i][j-1]);
                }
            }
        }

        return a[m][n];


    }

    public static int max(int a, int b){
        return (a>b)? a : b;
    }
    public static void main(String[] args){
       int a = LCSdp("AGGTAB", "GXTXAYB", 6, 7 );
       System.out.print("LCS length : " + a);
    }
}
