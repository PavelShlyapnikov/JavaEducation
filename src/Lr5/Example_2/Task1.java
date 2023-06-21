package Lr5.Example_2;

public class Task1 {
    public char ch1, ch2;

    public void setChar(char ch1, char ch2) {
        this.ch1 = ch1;
        this.ch2 = ch2;
    }

    public void showAllSymbol() {
        int a = ch1;
        int b = ch2;
        if (a > b) {
            a = ch2;
            b = ch1;
        }
        int c = 1;
        for (int i = a; i <= b; i++) {
            System.out.println("№ " + c + " символ: " + (char) i);
            c++;
        }
    }
}
