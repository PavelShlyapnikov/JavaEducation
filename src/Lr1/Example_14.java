package Lr1;

import java.util.Scanner;

public class Example_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Укажите произвольное число: ");
        int num1 = in.nextInt();

        int num2;
        num2 = num1 - 1;

        int num3;
        num3 = num1 + 1;

        int num4;
        num4 = (num1 + num2 + num3)*2;

        System.out.println(num2 + " " + num1 + " " + num3 + " " + num4);
        in.close();

    }

}
