package Lr3;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
//        Напишите программу, которая выводит последовательность чисел
//        Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
//        следующее число равно сумме двух предыдущих (получается
//        последовательность 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее).
//        Количество чисел в последовательности вводится пользователем. Предложите версии
//        программы, использующие разные операторы цикла.

        Scanner v = new Scanner(System.in);
        System.out.print("Введите число: ");
        int c = 2;
        int b = v.nextInt();
        int[] a = new int[b];
        a[0] = 1;
        a[1] = 1;

        /*
         for (int i = 2; i < a.length; ++i) {
            a[i] = a[i - 1] + a[i - 2];
        */

        while(c < a.length){
            a[c] = a[c - 1] + a[c - 2];
            c++;
        }
        for(int i=0; i < a.length; ++i)
            System.out.println(a[i]);

        }
    }

