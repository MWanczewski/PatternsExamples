package structuralPatern.Adapter;

public class FantasyBook implements Book{
    @Override
    public String bio() {
        return "biografia";
    }

    @Override
    public String front() {
        return "front picture";
    }
}
