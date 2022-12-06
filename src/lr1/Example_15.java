package lr1;

import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int num1 = in.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = in.nextInt();

        int res1;
        res1 = num1 + num2;

        int res2;
        res2 = num1 - num2;

        System.out.println("Сумма указанных чисел: " + res1);
        System.out.println("Разность указанных чисел: " + res2);

        in.close();

    }

}
