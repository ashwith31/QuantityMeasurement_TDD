package com.quantitymeasurement;

public enum Unit {
    FEET(30.0, "Length"), INCH(2.5, "Length"),
    YARD(90.0, "Length"), CENTIMETER(1.0, "Length"),
    GALLON(3780, "Volume"), LITERS(1000, "Volume"),
    MILLILITERS(1, "Volume"), KILOGRAM(1000, "Weight"),
    GRAM(1, "Weight"), TONNE(1000000, "Weight"),
    FAHRENHEIT(100, "Temperature"), CELSIUS(212, "Temperature"),
    ERROR(0,"Invalid Inputs");

    //private static Unit Feet;
    private final double baseCoversionValue;

    public String getQUnit() {
        return unit;
    }

    private final String unit;

    /**
     * Constructor to initialize objects.
     *
     * @param baseCoversionValue
     */
    Unit(double baseCoversionValue, String unit) {
        this.baseCoversionValue = baseCoversionValue;
        this.unit = unit;
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
