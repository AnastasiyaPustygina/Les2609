package com.samsung.les2609;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {11, 21, 31},
                {41, 51, 61},
                {71, 81, 91}
        };

    }

    public static void rotRight(int[] a){
        int lastElement = a[a.length - 1];
        for (int i = a.length - 1; i > 0; i--) {
            a[i] = a[i - 1];
        }
        System.out.println();
        a[0] = lastElement;
    }
}