import java.util.ArrayList;

public class OddEvenSeparator {

    ArrayList<Integer> numbers = new ArrayList<>();

    void addNumber(int number) {
        numbers.add(number);
    }

    void even() {
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    void odd() {
        for (int number : numbers) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}