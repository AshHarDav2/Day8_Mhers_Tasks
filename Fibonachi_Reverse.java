package com.company;

import java.util.Scanner;

public class Fibonachi_Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] array = new int[count];
        int elem1 = 0, elem3;
        int elem2 = 1;
        array[0]= elem1;
        array[1]=elem2;
        System.out.print(elem1 + " " + elem2 + " ");
        for (int i = 2; i < count; i++) {
            elem3 = elem1 + elem2;
            System.out.print(elem3 + " ");
            elem1 = elem2;
            elem2 = elem3;
            array[i] = elem3;
        }
        System.out.println();
        for (int i = count - 1; i >=0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
