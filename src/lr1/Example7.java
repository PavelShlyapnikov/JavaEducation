package lr1;

import java.util.Scanner;
public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.print("Укажите ваш возраст: ");
        int age = in.nextInt();

        System.out.println(name + " " + age);
        in.close();
    }

}
