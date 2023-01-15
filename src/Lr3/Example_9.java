package Lr3;

import java.util.Random;

//        Напишите программу, в которой создается массив и заполняется
//        случайными числами. Массив отображается в консольном окне.
//        В этом массиве необходимо определить элемент с минимальным значением.
//        В частности, программа должна вывести значение элемента с минимальным
//        значением и индекс этого элемента. Если элементов с минимальным
//        значением несколько, должны быть выведены индексы всех этих элементов.
public class Example_9 {
    public static void main(String[] args) {
        int[] arrayInt = new int[7];
        Random random = new Random();

        for (int i = 0; i < arrayInt.length; i++) {
            arrayInt[i] = i + random.nextInt(100);
            System.out.println("Число массива: " + arrayInt[i]);
        }

        int min = arrayInt[0];
        for(int i = 0; i < arrayInt.length; i++) {
            if(arrayInt[i] < min)
                min = arrayInt[i];
        }
        System.out.println("Минимальное число в массиве: " + min);

        int index;
        for (int i = 0; i < arrayInt.length; ++i) {
            if (min >= arrayInt[i]) {
                index = i;
                System.out.println("Индекс мин. числа в массиве: " + index);
            }
        }

    }
}
