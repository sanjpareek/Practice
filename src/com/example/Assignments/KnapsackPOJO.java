package com.example.Assignments;

/**
 * Created by sanjana on 10/7/17.
 */
public class KnapsackPOJO {
    private int index;
    private double value;
    private double weight;

    public KnapsackPOJO(int index, double value, double weight){
        this.index = index;
        this.value = value;
        this.weight = weight;
    }
    public void setIndex(int index) {
        this.index = index;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getIndex() {
        return index;
    }
}
