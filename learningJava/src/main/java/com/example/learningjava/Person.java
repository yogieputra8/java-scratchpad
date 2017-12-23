package com.example.learningjava;

/**
 * Created by yogieputra on 23/12/17.
 */

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void speakName(){
        System.out.println("My name is " + firstName + " " + lastName + ". I am " + age + " years of age.");
    }
}
