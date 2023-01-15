package Lr4;

// Напишите программу, в которой создается двумерный массив,
// который выводит прямоугольник из цифр 2.
public class Example_3 {
    public static void main(String[] args) {
        char[][] arrayChar = new char[10][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                arrayChar[j][i] = '2';
            }
        }

        for (int i = 0 ; i < 4; i++){
            for (int j = 0; j < 10; j++){
                System.out.print(arrayChar[j][i]);
            }
            System.out.println("\r");
        }
    }
}
