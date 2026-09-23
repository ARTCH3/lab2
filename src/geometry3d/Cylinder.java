package geometry3d;

import geometry2d.Figure;
import exceptions.InvalidHeightException;

public class Cylinder {

    Figure base;
    double height;

    public Cylinder(Figure base, double height) throws InvalidHeightException {
        if (height <= 0) {
            throw new InvalidHeightException("Height must be greater than 0");
        }

        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }
}