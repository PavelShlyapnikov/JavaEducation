package Lr3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

// Напишите программу, в которой создается целочисленный
// массив, заполняется случайными числами и после этого значения элементов в
// массиве сортируются в порядке убывания значений.
public class Example_10 {
    public static void main(String[] args) {
        Integer[] arrayInt = new Integer[5];
        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + random.nextInt(100);
        }

        Arrays.sort(arrayInt, Collections.reverseOrder());
        System.out.println("Произведена сортировка массива: ");

     for (int i = 0; i < arrayInt.length; i++) {
         System.out.println("Элемент массива [" + i + "] после сортировки = " + arrayInt[i]);
     }

    }
}
