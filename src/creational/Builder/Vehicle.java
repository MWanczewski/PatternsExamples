package creational.Builder;

import java.util.List;

public class Vehicle implements VehicleBuilder {
    private final int tankSize;
    private final List<Wheel> wheels;

    public Vehicle(int tankSize, List<Wheel> wheel) {
        this.tankSize = tankSize;
        this.wheels = wheel;
    }

    @Override
    public void addWheel() {

    }

    @Override
    public void setTank(int size) {

    }

    @Override
    public Vehicle build() {
        return null;
    }
}
