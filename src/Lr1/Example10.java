package Lr1;

import java.util.Scanner;

public class Example10 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int year;
        year = 2022;

        System.out.print("Укажите ваш год рождения: ");
        int res = in.nextInt();

        int answer;
        answer = year - res;

        System.out.print("Вам " + answer + " год/лет");
        in.close();

    }

}