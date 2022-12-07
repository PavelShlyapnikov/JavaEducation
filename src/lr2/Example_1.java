package lr2;

import java.util.Scanner;

public class Example_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Укажите число, программа проверит делится ли число на 3: ");
        int num = in.nextInt();

        if (num % 3 == 0) {
            System.out.println("Число делится на 3");
        }
                else {
            System.out.println("Число не делится на 3");
        }
            in.close();
    }

}
