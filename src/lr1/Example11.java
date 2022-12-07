package lr1;

import java.util.Scanner;

public class Example11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Укажите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Укажите ваш год рождения: ");
        int res = in.nextInt();

        int year;
        year = 2022;

        int answer;
        answer = year - res;

        System.out.print(name + ", Вам " + answer + " год/лет");
                in.close();
    }
}
