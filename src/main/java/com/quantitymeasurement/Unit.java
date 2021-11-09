package com.quantitymeasurement;
/**************************************************************************
 * In this enum we have all the information regarding the units
 *
 * @author Ashwith
 * @since 8/11/21
 ****************************************************************************/
public enum Unit {
    FEET(12.0, "Length"), INCH(1.0, "Length"),
    YARD(36.0, "Length"), CENTIMETER(0.4, "Length"),
    GALLON(3.780, "Volume"), LITERS(1, "Volume"),
    MILLILITERS(0.001, "Volume"), KILOGRAM(1, "Weight"),
    GRAM(0.001, "Weight"), TONNE(1000, "Weight"),
    FAHRENHEIT(100, "Temperature"), CELSIUS(212, "Temperature"),
    ERROR(0,"Invalid Inputs");

    private final double baseConversionValue;
    private final String unit;

    /**
     * Constructor to initialize objects.
     *
     * @param baseConversionValue
     */
    Unit(double baseConversionValue, String unit) {
        this.baseConversionValue = baseConversionValue;
        this.unit = unit;
    }

    /**
     * Getter for baseConversionValue.
     *
     * @return double - baseConversionValue
     */
    public double getBaseConversionValue() {
        return baseConversionValue;
    }

    public String getQuantityUnit() {
        return unit;
    }
}
