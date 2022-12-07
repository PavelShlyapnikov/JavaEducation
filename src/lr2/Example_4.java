package lr2;

import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число, \nкоторое попадает в диапазон от 5 до 10 включительно: ");
        int num = in.nextInt();

        if (num >= 5 && num <= 10) {
            System.out.println("Ура! Вы все верно ввели!");
        } else {
            System.out.println("Эх! Вы ввели не верное число");
        }
        in.close();
    }
}
