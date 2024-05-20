package com.example.lab1;

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = {6,3,7,2,6,10,2,5,8,1,9};

        printAllElement(array);
        System.out.println();

        int[] sortAscArray = sortByASC(array);
        for (int i : sortAscArray) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println(findMax(array));
    }

    public static void doTask(int numberElement, int[] elements) {


    }

    public static void printAllElement(int[] elements) {
        for (int i : elements) {
            System.out.print(i + ",");
        }
    }

    public static int[] sortByASC(int[] elements) {
        int[] sorted = elements;
        for (int i = 0; i < sorted.length; i++) {
            for (int j = 0; j < sorted.length - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int bigger = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = bigger;
                }
            }
        }
        return sorted;
    }
    public static int findMax(int[] elements) {
        int max = elements[0];
        for(int i : elements) {
            if (max < elements[i]) {
                max = elements[i];
            }
        }
        return max;
    }
}
