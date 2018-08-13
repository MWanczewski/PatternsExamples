package creational.prototype;

public class Computer implements Cloneable{
    private final String processorType;
    private final Integer memorySize;
    private final String screen;

    public Computer(String processorType, Integer memorySize, String screen) {
        this.processorType = processorType;
        this.memorySize = memorySize;
        this.screen = screen;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Computer(processorType, memorySize, screen);
    }
}
