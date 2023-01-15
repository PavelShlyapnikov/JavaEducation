package Lr4;

import java.util.Random;
import java.util.Scanner;

// Напишите программу, в которой создается и инициализируется
// двумерный числовой массив. Затем из этого массива удаляется строка и
// столбец (создается новый массив, в котором по сравнению с исходным
// удалена одна строка и один столбец). Индекс удаляемой строки и индекс
// удаляемого столбца определяется с помощью генератора случайных чисел.
public class Example_6 {
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

        int e = random.nextInt(c-1);
        int f = random.nextInt(d-1);
        System.out.println("\nПроизводится удаление столбца - " + e + "; Производится удаление строки - " + d + ";\n");

        int [][] array2= new int [c-1][d-1];
        for (int i = 0, s = 0; i < c-1; s++) {
            if(s!=e) {
                for (int j = 0, k = 0; j < d -1; k++) {
                    if (k!= f) {
                        array2[i][j] = array[s][k];
                        System.out.print(array2[i][j] + " " + " ");
                        j++;
                    }
                }
                i++;
                System.out.println();
            }
        }

    }
}
