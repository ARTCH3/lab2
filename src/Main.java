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
    }
}