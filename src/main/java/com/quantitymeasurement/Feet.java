package com.quantitymeasurement;

import java.util.Objects;

public class Feet {
    public double getValue() {
        return value;
    }

    private final double value;

    public Feet(double  value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}
