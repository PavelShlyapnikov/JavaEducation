package Lr2;

import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        int num = in.nextInt();

        if (num%4 == 0 && num > 9) {
            System.out.println("Ура! Число делится на 4 и при этом больше 10");
        } else {
            System.out.println("Эх! Число не делится на 4, либо оно меньше 10");
        }

        in.close();

        }
    }
