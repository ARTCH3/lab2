public class Balance {

    int leftWeight = 0;
    int rightWeight = 0;

    void addLeft(int weight) {
        leftWeight = leftWeight + weight;
    }

    void addRight(int weight) {
        rightWeight = rightWeight + weight;
    }

    void result() {
        if (leftWeight == rightWeight) {
            System.out.println("=");
        }
        else if (leftWeight > rightWeight) {
            System.out.println("L");
        }
        else {
            System.out.println("R");
        }
    }
}