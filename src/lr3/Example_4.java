package lr3;

import java.util.Scanner;

public class Example_4 {

//    Напишите программу, в которой пользователем вводится два
//    целых числа. Программа выводит все целые числа — начиная с наименьшего
//    (из двух введенных чисел) и заканчивая наибольшим (из двух введенных
//    чисел).
//    Предложите разные версии программы (с использованием разных операторов цикла).

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите 1-е число: ");
        int num1 = in.nextInt();

        System.out.print("Введите 2-е число: ");
        int num2 = in.nextInt();

        if(num2 < num1) // если второе меньше первого, то для удобства меняем их местами
        {
            int low = num2;
            num2 = num1;
            num1 = low;
        }

        withFor(num1, num2); // С использования цикла for

        System.out.println(" ");

        withWhile(num1, num2); // С использованием цикла while
    }

    static void withFor(int num1, int num2)
    {
        for(int i=num1;i<=num2;i++)
            System.out.print(i + (i < num2 ? ", ": ""));
    }

    static void withWhile(int num1, int num2)
    {
        while(num1<=num2) {
            System.out.print(num1 + (num1 < num2 ? ", ": ""));
            num1++;
        }
    }
}