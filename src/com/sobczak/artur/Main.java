package com.sobczak.artur;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // program that fills an array with numbers that add up to zero

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
//                    int randomValue2 = random.nextInt(20);
//                    tab[j] = randomValue2;
                }
            }
        }

//            for (int i = 0; i < tab.length - 1; i++){
//                for (int j = i + 1; j < tab.length - 1; j++){
//                    if (tab[j] == tab[i]){
//                        int randomValue2 = random.nextInt(20);
//                        tab[j] = randomValue2;
//                    }
//                }
//            }


//        for (int l = 0; l < tab.length - 1; l++) {
//            for (int k = 0; k < tab.length - 1; k++) {
//                if (tab[k] == tab[l]) {
//                    int randomValue2 = random.nextInt(20);
//                    tab[k] = randomValue2;
//                }
//            }
//        }

        for (int j = 0; j < tab.length; j++) {
            sumArrayElement += tab[j];
        }

        int lastArrayElement = -sumArrayElement;
        tab[lastArrayPosition] = lastArrayElement;

        System.out.println(Arrays.toString(tab));
    }
}

