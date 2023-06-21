package Lr5.Example_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = in.nextInt();
        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        Task1 Task1_1 = new Task1();
        Task1 Task1_2 = new Task1(a);
        Task1 Task1_3 = new Task1(a,b);
    }
}


//    №3  Напишите программу с классом, у которого есть два целочисленных поля.
//        В классе должны быть описаны конструкторы, позволяющие создавать
//        объекты без передачи аргументов, с передачей (в консоль) одного аргумента
//        и с передачей двух аргументов.