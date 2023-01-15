package Lr4;

// Напишите программу, в которой создается двумерный целочисленный
// массив. Он заполняется случайными числами.
// Затем в этом массиве строки и столбцы меняются местами:
// первая строка становится первым столбцом,
// вторая строка становиться вторым столбцом и так далее.
// Например, если исходный массив состоял из 3 строк и 5 столбцов,
// то в итоге получаем массив из 5 строк и 3 столбцов.

import java.util.Random;
import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int c = in.nextInt();
        System.out.print("Количество столбцов: ");
        int d = in.nextInt();
        int[][] array = new int[c][d];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < d; j++) {
                array[i][j] = random.nextInt(10,99);
                System.out.print(array[i][j] + " " + " ");
            }
            System.out.println();
        }
        System.out.println("\nПроизводится замена местами строк и столбцов... \n");
        int[][] array2 = new int [d][c];
        for (int i = 0 ; i < d; i++) {
            for (int j = 0; j < c; j++) {
                array2[i][j] = array[j][i];
                System.out.print(array2[i][j] + " " + " ");
            }
            System.out.println();

        }
    }
}
