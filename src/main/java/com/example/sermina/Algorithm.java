package com.example.sermina;

public class Algorithm {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    public static int findMax(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        } else {
            int mid = (start + end) / 2;
            int leftMax = findMax(arr, start, mid);
            int rightMax = findMax(arr, mid + 1, end);
            return Math.max(leftMax, rightMax);
        }
    }

    public static int findMin(int[] arr, int start, int end) {
        if (start == end) {
            return arr[start];
        } else {
            int mid = (start + end) / 2;
            int leftMin = findMin(arr, start, mid);
            int rightMin = findMin(arr, mid + 1, end);
            return Math.min(leftMin, rightMin);
        }
    }
    public static int countDigits(int num) {
        if (num < 10) {
            return 1;
        } else {
            return 1 + countDigits(num / 10);
        }
    }

}
