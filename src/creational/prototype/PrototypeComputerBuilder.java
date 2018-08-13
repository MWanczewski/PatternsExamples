package creational.prototype;

public class PrototypeComputerBuilder {
    private final static Computer instance = new Computer("AMD", 1024, "LG");
    Computer getComputer() throws CloneNotSupportedException {
        return (Computer) instance.clone();
    }
}
