package Lr1;

import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Укажите вашу фамилию: ");
        String surname = in.nextLine();

        System.out.print("Укажите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Укажите ваше отчество: ");
        String patronymic = in.nextLine();

        System.out.println("Привет, " + surname + " " + name + " " + patronymic);
        in.close();
    }
}