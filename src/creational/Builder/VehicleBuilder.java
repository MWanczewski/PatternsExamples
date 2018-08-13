package creational.Builder;

public interface VehicleBuilder {
    void addWheel();
    void setTank(int size);
    Vehicle build();
}
