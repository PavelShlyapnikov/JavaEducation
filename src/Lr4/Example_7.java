package Lr4;

// Напишите программу, в которой создается двумерный числовой массив
// и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
// затем последний столбец (снизу вверх), вторая строка (слева направо) и так далее.

import java.util.Scanner;

public class Example_7 {
    public static void main(String[] args) {
        System.out.println("Змейка из чисел..\n");
        Scanner id = new Scanner(System.in);
        System.out.print("Введите количество строк змейки: ");
        int a =id.nextInt();
        System.out.print("Введите количество столбцов змейки: ");
        int b = id.nextInt();
        int Snake[][] = new int[a][b];
        int back = 0, main = 0, h = 0;
        for (int i = 0 ; h <Snake.length ; h++) {
            for (int j = 0 ; j <(Snake[i].length - back); j++) {
                Snake[i][j] = main;
                main++;
            }
            i++;
            for (int k = i; k <Snake.length; k++) {
                Snake[k][Snake[i].length-1-back] = main;
                main++;
            }
            back++;
        }
        for (int i =0; i < Snake.length; i++) {
            for (int j = 0; j <Snake[i].length; j++){
                System.out.print(Snake[i][j] + " ");
            }
            System.out.println();
        }
    }
}
