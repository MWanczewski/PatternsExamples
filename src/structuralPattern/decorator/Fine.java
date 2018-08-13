package structuralPattern.decorator;

public class Fine implements Viewable {
    private String reason;

    public Fine(String reason) {
        this.reason = reason;
    }

    @Override
    public void show() {
        System.out.println("Popenies wykroczenie: ");
    }
}
