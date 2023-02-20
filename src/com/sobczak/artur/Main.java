package com.sobczak.artur;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private String sumElementInArray() {

        System.out.println("Please give amount of array: ");
        Scanner sc = new Scanner(System.in);
        int arrayDims = sc.nextInt();

        Random random = new Random();
        int[] tab = new int[arrayDims];
        int sumArrayElement = 0;
        int lastArrayPosition = tab.length - 1;

        for (int i = 0; i < tab.length - 1; i++) {
            int randomValue = random.nextInt(30) - 10;
            tab[i] = randomValue;

            for (int j = 0; j < i; j++) {
                if (tab[i] == tab[j]) {
                    int value = tab[i];
                    value++;
                    tab[i] = value;
                }
            }
        }

        for (int j = 0; j < tab.length; j++) {
            sumArrayElement += tab[j];
        }

        int lastArrayElement = -sumArrayElement;
        tab[lastArrayPosition] = lastArrayElement;

        return Arrays.toString(tab);
    }

    public static void main(String[] args) {
        // program that fills an array with numbers that add up to zero

        Main main = new Main();
//      System.out.println(main.sumElementInArray());
        String resultOfMethod = main.sumElementInArray();
        System.out.println(resultOfMethod);

    }
}



