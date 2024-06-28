package com.example.lab1;

public class main {
    public static void main(String[] args) {

        Atom[] atoms = new Atom[1];
        for( int i = 0; i < 1; i++ ) {
            Atom atom = new Atom();
            atom.createAtom();
            atoms[i] = atom;
        }

        System.out.println(" Atomic Information");
        System.out.println(" ==================");

        for (Atom atom : atoms) {
            System.out.println(atom.toString());
        }
    }
}
