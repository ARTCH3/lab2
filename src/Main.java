public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("<--- Задание 1: Начало --->");
        Button button = new Button();

        button.click();
        button.click();
        System.out.println("<--- Задание 1: Конец --->");
        // Задание 2
        System.out.println("<--- Задание 2: Начало --->");
        Balance balance1 = new Balance();
        balance1.addLeft(10);
        balance1.addRight(10);
        balance1.result();

        Balance balance2 = new Balance();
        balance2.addLeft(10);
        balance2.addRight(20);
        balance2.result();

        Balance balance3 = new Balance();
        balance3.addLeft(20);
        balance3.addRight(10);
        balance3.result();
        System.out.println("<--- Задание 2: Конец --->");
        // Задание 3
        System.out.println("<--- Задание 3: Начало --->");
        Bell bell = new Bell();

        bell.sound();
        bell.sound();
        bell.sound();
        bell.sound();
        System.out.println("<--- Задание 3: Конец --->");
        // Задание 4
        System.out.println("<--- Задание 4: Начало --->");
        OddEvenSeparator separator = new OddEvenSeparator();

        separator.addNumber(1);
        separator.addNumber(2);
        separator.addNumber(3);
        separator.addNumber(4);
        separator.addNumber(5);
        separator.addNumber(6);

        System.out.println("Чётные:");
        separator.even();

        System.out.println("Нечётные:");
        separator.odd();
        System.out.println("<--- Задание 4: Конец --->");
    }
}