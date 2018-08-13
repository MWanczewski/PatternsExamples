package BehaviourPatterns.Command;

public class TurnOnLight implements Command{
    private final Light light;

    public TurnOnLight(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOn();
    }
}
