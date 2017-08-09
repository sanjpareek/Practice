package com.example.misc;


import java.util.*;

/**
 * Created by sanjana on 9/8/17.
 *
 * Comparable interface defines the natural order of sorting objects of a class
 * We can define only one order of sorting these objects using Comparable
 * It is internal to the class
 *
 * Comparator interfaces allows objects to be sorted on different fields
 * It is external to the class
 *
 */
public class Person implements Comparable<Person> {

    int age;
    String name;
    int happinessIndex;

    Person(int age, String name, int happinessIndex){
        this.age = age;
        this.name = name;
        this.happinessIndex = happinessIndex;
    }

    public static void main(String[] args){

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person(10, "Sam Mendes", 4));
        personList.add(new Person(32, "Samuel Mendes", 3));
        personList.add(new Person(20, "Richard Mendes", -1));
        personList.add( new Person(48, "Jon Mendes", 0));
        personList.add( new Person(1, "Jon Mendes", 5));
        Collections.sort(personList);

        for(int i = 0 ; i<personList.size(); i++){
            System.out.println(personList.get(i).name);
        }

        System.out.println("=================");
        PersonComparator sortByAge = new PersonComparator();
        Collections.sort(personList, sortByAge);

        for(int i = 0 ; i<personList.size(); i++){
            System.out.println(personList.get(i).name);
        }
        System.out.println("=================");

        PersonHappinessComparator personHappinessComparator = new PersonHappinessComparator();
        Collections.sort(personList, personHappinessComparator);

        for(int i = 0 ; i<personList.size(); i++){
            System.out.println(personList.get(i).name);
        }
    }

    public int compareTo(Person p){
        return this.name.compareTo(p.name);
    }

}
