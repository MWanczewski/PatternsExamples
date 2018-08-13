package BehaviourPatterns.Command;

public class TurnOffLight implements Command {
    private final Light light;

    public TurnOffLight(Light light) {
        this.light = light;
    }
    public void execute() {
        light.turnOff();
    }
}
