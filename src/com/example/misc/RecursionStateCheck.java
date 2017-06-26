package com.example.misc;

/**
 * Created by sanjana on 26/6/17.
 */
public class RecursionStateCheck {
    private void callMe(int value){
        if(value == 0)
            return;
        int valueHere = value;
        callMe(value-1);
        System.out.println("value : " + value );
        System.out.println("valueHere : " + valueHere);

    }

    public static void main(String[] args){
        RecursionStateCheck recursionStateCheck = new RecursionStateCheck();
        recursionStateCheck.callMe(5);
    }
}
