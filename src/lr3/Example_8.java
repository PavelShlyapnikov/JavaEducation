package lr3;

import java.util.Scanner;

// Напишите программу, в которой создается символьный массив из
// 10 элементов. Массив заполнить большими (прописными) буквами
// английского алфавита. Буквы берутся подряд, но только согласные (то есть
// гласные буквы ' А ' ,' Е ' и ' I ' при присваивании значений элементам массива
// нужно пропустить).
// Отобразите содержимое созданного массива в консольном окне.

public class Example_8 {
    public static void main(String[] args) {

        int a;
        char c = 'A', b[] = new char[20], d[] = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};
        for (int i = 0; i < b.length; ++i) {
            b[i]=c;
            for (int j = 0; j < d.length; ++j) {
                if (b[i] == d[j]) {
                    i--;
                    break;
                }
            }
            c++;
        }
        for (int i = 0; i < b.length; ++i)
            System.out.println(b[i]);

    }
}