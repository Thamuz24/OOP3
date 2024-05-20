package com.example.lab1;

import java.util.Scanner;

public class Atom {
    private int number;
    private String symbol;
    private String fullName;
    private float weight;

    public Atom() {
    }

    public Atom(int number, String symbol, String fullName, float weight) {
        this.number = number;
        this.symbol = symbol;
        this.fullName = fullName;
        this.weight = weight;
    }

    public void createAtom() {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number atom :");
        this.number = input.nextInt();

        System.out.println("enter symbol atom :");
        this.symbol = input.next();

        System.out.println("enter full name of atom :");
        this.fullName = input.next();

        System.out.println("enter weight atom :");
        this.weight = input.nextFloat();

    }

    @Override
    public String toString() {
        return this.number + " " + this.symbol + " " + this.fullName + " " + this.weight;
    }
}
