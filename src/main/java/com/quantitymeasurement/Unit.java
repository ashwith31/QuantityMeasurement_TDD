package com.quantitymeasurement;

public enum Unit {
    FEET(30.0), INCH(2.5), YARD(90.0), CENTIMETER(1.0);

    public double getBaseCoversionValue() {
        return baseCoversionValue;
    }

    private final double baseCoversionValue;

    Unit(double baseCoversionValue) {
        this.baseCoversionValue = baseCoversionValue;
    }

}
