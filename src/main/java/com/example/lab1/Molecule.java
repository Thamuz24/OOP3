package com.example.lab1;

public class Molecule {
    private String structure;
    private String name;
    private Double weight;

    public Molecule() {
    }

    public Molecule(String structure, String name, Double weight) {
        this.structure = structure;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Molecule{" +
                "structure='" + structure + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
