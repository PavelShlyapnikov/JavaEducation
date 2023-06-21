package Lr5.Example_1;

public class Task1 {
    private char ch1;

    // Метод №1 - позволяет присвоить значение полю (через Setter)
    public void setCh1(char ch1) {
        this.ch1 = ch1;
    }

    // Метод №2 - при вызове возвращает результатом код символа.
    // преобразовали символ к числу через кастование (был char возвращаем int))
    public int getCodeSymbol() {
        return ch1;
    }

    // метод позволяет вывести в консольное окно символ (значение поля) и его код
    public void showCodeAndValue() {
        System.out.println("Значение: " + ch1);
        System.out.println("Код символа: " + (int) ch1);
    }
}
