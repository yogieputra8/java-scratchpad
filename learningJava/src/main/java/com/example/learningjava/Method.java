package com.example.learningjava;

/**
 * Created by yogieputra on 27/11/17.
 */

public class Method {
    public static void main(String[] args) {
        printName();

        int len = 10;
        int wid = 5;
        printArea(len, wid);
        int area = getArea(5, 6);
        System.out.println(area);
    }

    public static void printName(){
        System.out.println("Hi, my name is Yogie!");
    }

    public static void printArea(int length, int width){
        System.out.println("Area: " + (length * width));
    }

    public static int getArea(int length, int width){
        return length * width;
    }
}
