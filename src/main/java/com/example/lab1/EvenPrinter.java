package com.example.lab1;

public class EvenPrinter {
    public static void main(String[] args) {
        printByForAndContinue();
        System.out.println();
        printByForAndFlag();
    }

    public static void printByForAndContinue() {
        System.out.println("print even from 2 to 50 by for and continue");
        for (int i = 2; i <= 50; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.print(i + ",");
        }
    }

    public static void printByForAndFlag() {
        System.out.println("print even from 2 to 50 by for and flag");
        boolean flag = false;
        for (int i = 2; i <= 50; i++, flag = false) {
            if(i % 2 == 0) {
                flag = true;
            }
            if (flag) {
                System.out.print(i + ",");
            }
        }
    }
}
