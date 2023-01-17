package Lr4;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

// Шифр Цезаря
public class Example_8 {
    private static class Caeser {
        static String encryptText;
        private static String encrypt(String enText, int key) {

            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] + key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }

        private static String decrypt(String enText, int key)
        {
            char[] ArrayText = enText.toCharArray();
            int[] CharCode = new int[ArrayText.length];
            for (int i = 0; i < ArrayText.length; i++)
            {
                CharCode[i] = ArrayText[i];
                CharCode[i] = CharCode[i] - key;
            }
            for (int i = 0; i < ArrayText.length; i++)
            {
                ArrayText[i] = (char) CharCode[i];
            }
            encryptText = new String(ArrayText);
            return encryptText;
        }
    }
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в Шифр Цезаря\n");
        Scanner id = new Scanner(System.in);
        System.out.print("Введите текст для шифрования (любое слово): ");
        String text = id.nextLine();
        System.out.print("Введите ключ (цифрой): ");
        int shift = id.nextInt();
        String encryptStr = Caeser.encrypt(text, shift);
        System.out.print("\nТекст после преобразования :" + "\"" + encryptStr + "\"");
        System.out.print("\nВыполнить обратное преобразование? (y/n)\n");
        boolean cool = false;
        while (!cool) {
            String reply = id.next();
            if (reply.toLowerCase().equals("y")) {
                String decryptStr = Caeser.decrypt(encryptStr, shift);
                System.out.println(decryptStr);
                cool = true;
            }
            else if (reply.toLowerCase().equals("n")) {
                System.out.println("До свидания!");
                cool = true;
            }
            else {
                System.out.println("Введите корректный ответ: ");
                cool = false;
            }
        }

    }
}
