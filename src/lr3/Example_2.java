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
        String str1 = "Понедельник";
        String str2 = "Вторник";
        String str3 = "Среда";
        String str4 = "Четверг";
        String str5 = "Пятница";
        String str6 = "Суббота";
        String str7 = "Воскресение";

        System.out.print("Выберите вариант проверки: 1 для if или 2 для switch : ");
        int b = in.nextInt();
        System.out.println();

        // решение методом switch
        if (b == 1) {
            System.out.println("Введите день недели: ");
            String day = in.nextLine();
            switch (day) {
                case "Понедельник" -> System.out.println("Это 1-ый день недели");
                case "Вторник" -> System.out.println("2-ой день недели");
                case "Среда" -> System.out.println("3-ий день недели");
                case "Четверг" -> System.out.println("4-ый день недели");
                case "Пятница" -> System.out.println("5-ый день недели");
                case "Суббота" -> System.out.println("6-ой день недели");
                case "Воскресенье" -> System.out.println("7-ой день недели");
                default -> System.out.println("Такого дня нет");
            }
        }

            //решение методом if
            else if (b == 2) {
                System.out.print("Введите день недели: ");
                String a = in.next();
                if (a.equalsIgnoreCase(str1)) {
                    System.out.println("1-ый день недели");
                } else if (a.equalsIgnoreCase(str2)) {
                    System.out.println("2-й день недели");
                } else if (a.equalsIgnoreCase(str3)) {
                    System.out.println("3-й день недели");
                } else if (a.equalsIgnoreCase(str4)) {
                    System.out.println("4-й день недели");
                } else if (a.equalsIgnoreCase(str5)) {
                    System.out.println("5-й день недели");
                } else if (a.equalsIgnoreCase(str6)) {
                    System.out.println("6-й день недели");
                } else if (a.equalsIgnoreCase(str7)) {
                    System.out.println("7-й день недели");
                } else {
                    System.out.println("Такого дня нет");
                }
                in.close();
            }
        }
    }

