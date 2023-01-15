package Lr3;

import java.util.Scanner;

public class Example_1 {

    public static void main(String[] args) {
//        Напишите программу, в которой пользователь вводит целое число
//        в диапазоне от 1 до 7, а программа определяет по этому числу день недели.
//        Если введенное пользователем число выходит за допустимый диапазон,
//        выводится сообщение о том, что введено некорректное значение. Используйте
//        оператор выбора switch.

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7 (после нажмите Enter) \nи программа укажет " +
                "какому дню недели соответствует цифра: ");
        int a = in.nextInt();
        switch (a) {
            case 1:
                System.out.println("Это понедельник");
                break;
            case 2:
                System.out.println("Это вторник");
                break;
            case 3:
                System.out.println("Это среда");
                break;
            case 4:
                System.out.println("Это четверг");
                break;
            case 5:
                System.out.println("Это пятница");
                break;
            case 6:
                System.out.println("Это суббота");
                break;
            case 7:
                System.out.println("Это воскрессенье");
                break;
        }
        if(a < 1 | a > 7  )
            System.out.println("Введено некорректное значение");

    }
}
