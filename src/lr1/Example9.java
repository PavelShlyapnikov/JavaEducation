package lr1;

import java.util.Scanner;
public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in = new Scanner(System.in);

        System.out.print("Укажите номер месяца от 1 до 12: ");
        int month = in.nextInt();

        System.out.print("Укажите любое число дней, а мы ответим, содержит указанный вами месяц такое число дней, или нет: ");

        int day = in.nextInt();

        {if (month > 0 && month < 13)

                if (month == 1)
                    if (day > 0 && day < 32)
                        System.out.println("Да, январь содережит столько дней");


                    else
                        System.out.println("Нет, январь не содержит столько дней");
        }


        {
            if (month == 2)
                if (day > 0 && day < 29)
                    System.out.println("Да, февраль содережит столько дней");

                        else
                    System.out.println("Нет, февраль не содержит столько дней");
        }

            {
                if (month == 3)
                    if (day > 0 && day < 32)
                        System.out.println("Да, март содережит столько дней");
                    else
                        System.out.println("Нет, март не содержит столько дней");
            }

            {
                if (month == 4)
                    if (day > 0 && day < 31)
                        System.out.println("Да, Апрель содережит столько дней");
                    else
                        System.out.println("Нет, Апрель не содержит столько дней");
            }

            {
                if (month == 5)
                    if (day > 0 && day < 32)
                        System.out.println("Да, Май содережит столько дней");
                    else
                        System.out.println("Нет, Май не содержит столько дней");
            }

            {
                if (month == 6)
                    if (day > 0 && day < 31)
                        System.out.println("Да, Июнь содережит столько дней");
                    else
                        System.out.println("Нет, Июнь не содержит столько дней");
            }

            {
                if (month == 7)
                    if (day > 0 && day < 32)
                        System.out.println("Да, Июль содережит столько дней");
                    else
                        System.out.println("Нет, Июль не содержит столько дней");
            }

            {
                if (month == 8)
                    if (day > 0 && day < 32)
                        System.out.println("Да, Агуст содережит столько дней");
                    else
                        System.out.println("Нет, Август не содержит столько дней");
            }

            {
                if (month == 9)
                    if (day > 0 && day < 31)
                        System.out.println("Да, Сентябрь содережит столько дней");
                    else
                        System.out.println("Нет, Сентябрь не содержит столько дней");
            }

            {
                if (month == 10)
                    if (day > 0 && day < 32)
                        System.out.println("Да, Октябрь содережит столько дней");
                    else
                        System.out.println("Нет, Октябрь не содержит столько дней");
            }

            {
                if (month == 11)
                    if (day > 0 && day < 31)
                        System.out.println("Да, Ноябрь содережит столько дней");
                    else
                        System.out.println("Нет, Ноябрь не содержит столько дней");
            }

            {
                if (month == 12)
                    if (day > 0 && day < 32)
                        System.out.println("Да, Декабрь содережит столько дней");
                    else
                        System.out.println("Нет, Декабрь не содержит столько дней");
            }


    }
}