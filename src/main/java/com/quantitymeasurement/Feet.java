package com.quantitymeasurement;

import java.util.Objects;

public class Feet {
    private final double value;

    public Feet(double  value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}
