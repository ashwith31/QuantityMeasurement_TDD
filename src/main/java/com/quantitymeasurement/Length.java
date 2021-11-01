package com.quantitymeasurement;

import java.util.Objects;
/***************************************************************************************************
 * Purpose: This is a pojo class where we have all the information about the Units of Length that we have.
 *
 * @author Ashwith
 * @since 30/10/21
 ****************************************************************************************************/

public class Length {

    private final double value;
    private final Unit unit;

    /**
     * Constructor to initialize value and unit.
     *
     * @param unit
     * @param value
     */
    public Length(Unit unit, double value) {
        this.value = value;
        this.unit = unit;
    }

    /**
     * Getter for Unit
     *
     * @return unit
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * Getter for value.
     *
     * @return double - value
     */
    public double getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }
}
