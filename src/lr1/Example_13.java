package lr1;

import java.util.Scanner;

public class Example_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Пример сложения \n \nВведите первое число: ");
        int num1 = in.nextInt();

        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();

        int res;
        res = num1 + num2;

        System.out.println("\nОтвет: " + res);
        in.close();

    }

}
