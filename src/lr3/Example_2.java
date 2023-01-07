package lr3;

import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
//        Напишите программу, в которой пользователю предлагается
//        ввести название дня недели. По введенному названию программа определяет
//        порядковый номер дня в неделе. Если пользователь вводит неправильное
//        название дня, программа выводит сообщение о том, что такого дня нет.
//        Предложите версию программы на основе вложенных условных операторов и
//        на основе оператора выбора switch.

        Scanner in = new Scanner(System.in);
        System.out.println("Укажите название любого дня недели \n(Условие написания: название должно быть с большой буквы): ");
             String a = in.nextLine();
            switch (a) {
            case "Понедельник":
                System.out.println("Это 1-ый день недели");
                break;
            case "Вторник":
                System.out.println("2-ой день недели");
                break;
            case "Среда":
                System.out.println("3-ий день недели");
                break;
            case "Четверг":
                System.out.println("4-ый день недели");
                break;
            case "Пятница":
                System.out.println("5-ый день недели");
                break;
            case "Суббота":
                System.out.println("6-ой день недели");
                break;
            case "Воскресенье":
                System.out.println("7-ой день недели");
                break;
                default:
                    System.out.println("Такого дня нет");
                    break;
        }

    }
}
