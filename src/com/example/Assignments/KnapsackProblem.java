package com.example.Assignments;

import java.io.*;

/**
 * Created by sanjana on 10/7/17.
 */
public class KnapsackProblem {
    KnapsackPOJO[] knapsackPOJO;
    double weight;
    double value;
    int index;
    private void readFile(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));
        String entry ;
        while((entry= br.readLine()) != null){
            String[] entries = entry.split(" : ");
            double maxWeight = Double.parseDouble(entries[0]);
            String options[] = entries[1].split(" ");
            if(options.length > 1){
                int numberOfOptions = options.length;
                knapsackPOJO = new KnapsackPOJO[numberOfOptions];
                for(int i=0; i<numberOfOptions; i++){
                    String properties[] = options[i].substring(1,options[i].length()-1).split(",");
                    weight = Double.parseDouble(properties[1]);
                    value = Double.parseDouble(properties[2].replace("$",""));
                    index = Integer.parseInt(properties[0]);
                    knapsackPOJO[i] = new KnapsackPOJO(index, value, weight);
                }
               double result =  chooseThings(knapsackPOJO, maxWeight, numberOfOptions-1);
                System.out.println("Max value allowed : " + result);
            }
        }
    }

    private double chooseThings(KnapsackPOJO[] knapsackPOJO, double maxWeight, int numberOfOptions ){
        if(knapsackPOJO[numberOfOptions].getWeight() == 0.0 || numberOfOptions == 0)
            return 0;
        if(knapsackPOJO[numberOfOptions].getWeight() > maxWeight){
            return chooseThings(knapsackPOJO, maxWeight, numberOfOptions-1);
                }
            return max(chooseThings(knapsackPOJO, maxWeight, numberOfOptions-1)
                    ,knapsackPOJO[numberOfOptions].getValue()
                            + chooseThings(knapsackPOJO,
                            maxWeight- knapsackPOJO[numberOfOptions].getWeight()
                          , numberOfOptions-1));
    }

    private double max(double a, double b){
        return a > b ? a : b;
    }

    public static void main(String[] args) throws IOException {
        String fileName = "src/com/example/Assignments/sampleFile.txt";
        KnapsackProblem knapsackProblem = new KnapsackProblem();
        knapsackProblem.readFile(fileName);
    }
}
