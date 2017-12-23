package com.example.learningjava;

/**
 * Created by yogieputra on 27/11/17.
 */

public class Numbers {
    public static void main(String[] args) {
        int age = 25;
        int myFavoriteSports = -50;

        int sum = 5 + 5;
        int num1 = 10;
        int num2 = 13;
        System.out.println(sum);
        System.out.println(num1 + num2);

        int difference = 100 - 20;
        int product = 22 * 5;
        int divide = 15 / 5;

        System.out.println(difference);
        System.out.println(product);
        System.out.println(divide);

        int modulo = 20 % 3;
        System.out.println(modulo);

        // 32 bits of storage
        float bankBalance = 432.23f;

        // 64 bits of storage
        double thisIsADouble = 364.28734;

        // For big big BIG whole numbers (up to around 2 billions)
        long donaldTrumpsBankAccount;
    }
}
