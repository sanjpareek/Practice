package com.example.misc;

/**
 * Created by sanjana on 26/6/17.
 */
public class RecursionStateCheck {

    private int valueHere;

    private void callMe(int value){
        if(value == 0)
            return;
        valueHere = value;
        callMe(--value);
        System.out.println("value : " + value );
        System.out.println("valueHere : " + valueHere);

    }

    public static void main(String[] args){
        RecursionStateCheck recursionStateCheck = new RecursionStateCheck();
        System.out.println("Initial valueHere : " + recursionStateCheck.valueHere);
        recursionStateCheck.callMe(5);
        System.out.println("Final valueHere : " + recursionStateCheck.valueHere);
    }
}
