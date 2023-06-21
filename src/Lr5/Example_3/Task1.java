package Lr5.Example_3;

public class Task1 {

    int num1;
    int num2;

    Task1() {
        System.out.println("\n\tБез передачи аргумента");
    }
    Task1(int num1) {
        this.num1 = num1;
        System.out.println("\tПередача одного аргумента: " + num1);
    }
    Task1(int num1,int num2) {
        this.num1 = num1;
        this.num2 = num2;
        System.out.println("\tПередача двух аргументов: " + num1 + " и " + num2);
    }

}
