package structuralPattern.decorator;

public class Admonishment  extends FineDecorator {
    public Admonishment(Viewable viewable) {
        super(viewable);
    }
    public void show() {
        System.out.println("nie przjemuj sie to upomnienie");
    }
}
