public class Bell {

    boolean ding = true;

    void sound() {
        if (ding) {
            System.out.println("ding");
            ding = false;
        }
        else {
            System.out.println("dong");
            ding = true;
        }
    }
}