package com.example.misc;

import java.util.ArrayList;

/**
 * Created by sanjana on 3/8/17.
 *
 * Gien: 2D array.
 * You are given a sequence of points and the order in which you need to cover the points.
 * Give the minimum number of steps in which you can achieve it.
 * You start from the first point.
 *
 * (x,y) to
 (x+1, y),
 (x - 1, y),
 (x, y+1),
 (x, y-1),
 (x-1, y-1),
 (x+1,y+1),
 (x-1,y+1),
 (x+1,y-1)
 */
public class numberOfMoves {
    // X and Y co-ordinates of the points in order.
    // Each point is represented by (X.get(i), Y.get(i))
    public static int coverPoints(ArrayList<Integer> X, ArrayList<Integer> Y) {
        int curr_x = X.get(0);
        int curr_y = Y.get(0);
        int steps = 0;
        int s = 0;
        for(int i = 1; i<X.size(); i++){
            if( (curr_x <= 0 && curr_y <=0) ||( curr_x >= 0 && curr_y >= 0) ||
                    (X.get(i)<=0 && Y.get(i)<=0 ) || (X.get(i)>=0 && Y.get(i)>=0
            )  || (curr_x * X.get(i) <= 0 && curr_y * Y.get(i) <= 0) ||
                    (curr_x * X.get(i) >= 0 && curr_y * Y.get(i) >= 0)
                    ){
                s = max(Math.abs(curr_x - X.get(i)), Math.abs(curr_y - Y.get(i) ));
                steps += s;
            }else if ((curr_x <= 0 && curr_y >= 0) ||( curr_x >= 0 && curr_y <= 0)){
                s = Math.abs(curr_x - X.get(i))+ Math.abs(curr_y - Y.get(i) );
                steps += s;
            }
            curr_x = X.get(i);
            curr_y = Y.get(i);
            System.out.println(s);
        }
        return steps;
    }

    public static int max(int a, int b){
        return a>b?a:b;
    }

    public static void main(String[] args){
        ArrayList<Integer> X = new ArrayList<Integer>();
        ArrayList<Integer> Y = new ArrayList<Integer>();
        int[] a = {-6, -1, -4, -2, 12, 3, 3, -2, 13, -14, 10, -2, 0, -11, 8, -9, -10 };
        int[] b = { 14, 0, -11, -6, -14, 2, -10, 0, -1, 6, 3, 3, 8, -10, 7, -3, 11 };
        for(int i = 0 ; i < a.length ; i ++){
            X.add(a[i]);
            Y.add(b[i]);
        }
       System.out.print(coverPoints(X, Y));
    }
}
