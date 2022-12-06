package lr1;

import java.util.Scanner;

public class Example_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Укажите ваш возрат: ");
        int age = in.nextInt();

        int year;
        year = 2022;

        int answer;
        answer = year - age;

        System.out.println("Ваш год рождения " + answer);
        in.close();
    }


}
