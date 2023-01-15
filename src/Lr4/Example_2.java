package Lr4;

// Напишите программу, которая выводит в консольное окно прямоугольный треугольник;

public class Example_2 {
    public static void main(String[] args) {
        int figure = 5;
        int str = 0;

        for (int i = 0 ; i < figure; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print("#");
            }

            str = str + 1;
            System.out.println("\r");
        }
    }
}
