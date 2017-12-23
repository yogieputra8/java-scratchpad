package com.example.learningjava;

/**
 * Created by yogieputra on 27/11/17.
 */

public class Arrays {
    public static void main(String[] args) {

        int[] tomsAverage = new int[3];
        double[] dblArray;
        String[] names;

        tomsAverage[0] = 200;
        tomsAverage[1] = 300;
        tomsAverage[2] = 400;

        names = new String[2];
        names[0] = "Nia";
        names[1] = "Kevin";

        String[] top5cars = { "BMW", "Aston Martin", "VW", "Mercedes-Benz", "Honda" };


        Person person = new Person("Yogie", "Putra", 29);
        person.speakName();

    }
}
