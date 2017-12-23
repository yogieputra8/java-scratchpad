package com.example.learningjava;

/**
 * Created by yogieputra on 27/11/17.
 */

public class Conditional {
    public static void main(String[] args) {
        int accountBalance = 100;
        int itemPrice = 25;

        if (accountBalance >= itemPrice){
            System.out.println("You have purchased the item!");
        } else {
            System.out.println("You don't have enough money! Get a Job!");
        }


        int degrees = 70;

        if (degrees >= 70){
            System.out.println("Put on some sunblock!");
        } else if (degrees < 70 && degrees >= 59){
            System.out.println("You might need a sweater!");
        } else {
            System.out.println("Put on a heavy coat!");
        }


        boolean firstTimeCustomer = false;
        boolean isExecutiveMember = true;

        if (firstTimeCustomer || isExecutiveMember){
            System.out.println("You received a 10% discount!");
        }
    }
}
