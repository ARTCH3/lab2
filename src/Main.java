import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;
import exceptions.InvalidRadiusException;
import exceptions.InvalidHeightException;

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
        // Задание 5
        System.out.println("<--- Задание 5: Начало --->");
        Table table = new Table(2, 3);

        table.setValue(0, 0, 10);
        table.setValue(0, 1, 20);
        table.setValue(0, 2, 30);

        table.setValue(1, 0, 40);
        table.setValue(1, 1, 50);
        table.setValue(1, 2, 60);

        System.out.println(table);

        System.out.println("Строк: " + table.rows());
        System.out.println("Столбцов: " + table.cols());

        System.out.println("Значение: " + table.getValue(1, 2));

        System.out.println("Среднее: " + table.average());
        System.out.println("<--- Задание 5: Конец --->");
        // Задание 6
        System.out.println("<--- Задание 6: Начало --->");
        try {
            Circle circle = new Circle(5);

            System.out.println(circle);
            System.out.println("Площадь: " + circle.area());
            System.out.println("Периметр: " + circle.perimeter());

            Rectangle rectangle = new Rectangle(4, 6);

            System.out.println(rectangle);
            System.out.println("Площадь: " + rectangle.area());
            System.out.println("Периметр: " + rectangle.perimeter());

            Cylinder cylinder = new Cylinder(circle, 10);

            System.out.println("Объём цилиндра: " + cylinder.volume());
        }
        catch (InvalidRadiusException e) {
            System.out.println(e.getMessage());
        }
        catch (InvalidHeightException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("<--- Задание 6: Конец --->");
    }
}