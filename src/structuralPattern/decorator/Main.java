package structuralPattern.decorator;

public class Main {
    public static void main(String[] args) {
        Viewable viewable = new Fine("konrat piles");
        viewable = new Admonishment(viewable);
        viewable = new Admonishment(viewable);
        ((Admonishment) viewable).showBefore();
        viewable.show();
    }
}
