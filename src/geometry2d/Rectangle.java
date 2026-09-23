package geometry2d;

public class Rectangle implements Figure {

    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public String toString() {
        return "Rectangle: width = " + width + ", height = " + height;
    }
}