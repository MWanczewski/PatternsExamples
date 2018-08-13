package creational.Builder;

import java.util.ArrayList;
import java.util.List;

public class AmericanCarBuilder implements VehicleBuilder {
    private int tankSize;
    private List<Wheel> wheels;
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
