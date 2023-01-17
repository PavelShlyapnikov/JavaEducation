package Lr5.Example_1;

public class Main {

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.setCh1('L'); //Устанавливаем значение символа L

        //вызываем метод, который вернет число и выведет в консоль
//        int code = task1.getCodeSymbol();
//        System.out.println(code);

        // можно сэкономить место и сразу вывести в консоль
        System.out.println("getCodeSymbol " + task1.getCodeSymbol());

        task1.showCodeAndValue();


    }
}
// Напишите программу с классом, в котором есть закрытое символьное поле
// и три открытых метода. Один из методов позволяет присвоить значение полю.
// Еще один метод при вызове возвращает результатом код символа. Третий
// метод позволяет вывести в консольное окно символ (значение поля) и его код.