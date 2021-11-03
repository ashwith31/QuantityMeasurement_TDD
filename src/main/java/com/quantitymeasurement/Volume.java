package com.quantitymeasurement;

public class Volume {
    private final double value;
    private final Unit unit;

    /**
     * Constructor to initialize value and unit.
     *
     * @param unit
     * @param value
     */
    public Volume(Unit unit, double value) {
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
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }
}
