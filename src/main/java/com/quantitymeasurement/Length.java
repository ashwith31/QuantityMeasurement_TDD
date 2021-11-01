package com.quantitymeasurement;

/**
 * This is a pojo class where we have all the information about the Units thst we have.
 *
 * @author Ashwith
 * @since 30/10/21
 */
public class Length {

    private final double value;
    private final Unit unit;

    enum Unit {
        FEET, INCH, YARD, CENTIMETER
    }

    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0;
    }
}
