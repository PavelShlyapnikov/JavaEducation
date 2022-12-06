package lr1;

import java.util.Scanner;

public class Example8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Укажите текущий день недели: ");
        String week = in.nextLine();

        System.out.print("Укажите название текущего месяца: ");
        String month = in.nextLine();

        System.out.print("Укажите текущий номер для в месяце (дату): ");
        int day = in.nextInt();

        System.out.print("Сегодня: " + week + " " + day + " " + month);
        in.close();

    }
}
