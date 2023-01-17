package Lr5.Example_1;

public class Task1 {

    private char ch1;

    // Метод для присвоения значения полю (через Setter)
    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }
// Метод, который при вызове возвращает результатом код символа
// преобразовали символ к числу
    public int getCodeSymbol() {
        return ch1;
    }

    // метод позволяет вывести в консольное окно символ (значение поля) и его код
    public void showCodeAndValue() {
        System.out.println("Value = " + ch1);
        System.out.println("Code = " + (int) ch1);
    }


}
