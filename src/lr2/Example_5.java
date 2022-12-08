package lr2;

import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num1 = in.nextInt();

        int num2 = num1 / 1000;

        if (num2 >= 1) {
            System.out.println("В вашем числе " + num2 + " тысяч(и)");
        } else {
            System.out.println("В вашем числе меньше одной тысячи");
        }
        in.close();
    }
}
