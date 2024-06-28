package com.example.lab1;

import java.util.Random;

public class RadomNumber {
    public static void main(String[] args) {
        String numberPhone = "0";
        if (new Random().nextBoolean()) {
            numberPhone += 3;
        } else {
            numberPhone += 9;
        }

        for (int i = 0; i < 8; i++) {
            numberPhone += new Random().nextInt(9);
        }
        System.out.println(numberPhone);
    }
}
