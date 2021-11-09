package com.quantitymeasurement;
/*******************************************************************************************
 * Purpose: This is a quantity class in which we have information regarding quantities.
 *
 * @author Ashwith
 * @since 8/11/21
 ********************************************************************************************/
public class Quantity {
    private final double value;
    private final Unit unit;

    /**
     * Constructor to initialize value and unit.
     *
     * @param unit
     * @param value
     */
    public Quantity(Unit unit, double value) {
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
        Quantity volume = (Quantity) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }
}
