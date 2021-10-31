package com.quantitymeasurement;

public class QuantityMeasurement {

    public Inch convertFeetToInch(double feet) {
        return new Inch(feet * 12);
    }

    public Yard convertFeetToYard(double feet) {
        return new Yard(feet * 0.33);
    }

    public Inch convertYardToInch(double yard){
        return new Inch(yard * 36);
    }

    public Yard convertInchToYard(double inch){
        return new Yard(inch / 36);
    }

    public Centimeter convertInchToCentimeter(double value) {
        return new Centimeter(0);
    }
}
