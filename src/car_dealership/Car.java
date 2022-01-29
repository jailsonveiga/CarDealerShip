package car_dealership;

import java.util.ArrayList;

public class Car {

        private String make;
        private String model;
        private int mileage;
        private float gasTankPercent;

    public Car(String make, String model, int mileage, float gasTankPercent) {
        this.make = make;
        this.model = model;
        this.mileage = mileage;
        this.gasTankPercent = gasTankPercent;
    }

    public String getName() {
        return make + " " + model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public float getGasTankPercent() {
        return gasTankPercent;
    }

    public void setGasTankPercent(float gasTankPercent) {
        this.gasTankPercent = gasTankPercent;
    }

    @Override
public String toString() {
    return
            "make: " + make +
                    ", model: " + model +
                    ", mileage: " + mileage +
                    ", gasTankPercent: " + gasTankPercent;
}
}

