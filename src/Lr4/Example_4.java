package Lr4;

// Напишите программу, в которой создается двумерный массив,
// который выводит прямоугольный треугольник;
public class Example_4 {
    public static void main(String[] args) {
        char[][] arrayChar = new char[5][5];
        int str = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                arrayChar[j][i] = '#';
            }
        }
        for (int i = 0 ; i < 5; i++) {
            for (int j = 0; j <= str; j++) {
                System.out.print(arrayChar[j][i]);
            }
            str++;
            System.out.println("\r");
        }
    }
}
