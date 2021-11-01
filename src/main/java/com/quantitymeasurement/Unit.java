package com.quantitymeasurement;

public enum Unit {
    FEET(30.0), INCH(2.5), YARD(90.0), CENTIMETER(1.0),
    GALLON(3780), LITERS(1000), MILLILITERS(1);

    private final double baseCoversionValue;

    /**
     * Constructor to initialize objects.
     *
     * @param baseCoversionValue
     */
    Unit(double baseCoversionValue) {
        this.baseCoversionValue = baseCoversionValue;
    }

    /**
     * Getter for baseCoversionValue.
     *
     * @return double - baseConversionValue
     */
    public double getBaseCoversionValue() {
        return baseCoversionValue;
    }

}
