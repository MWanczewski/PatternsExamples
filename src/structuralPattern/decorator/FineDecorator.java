package structuralPattern.decorator;

public class FineDecorator implements Viewable{
    private Viewable viewable;

    public FineDecorator(Viewable viewable) {
        this.viewable = viewable;
    }

    @Override
    public void show() {
        viewable.show();
    }
    protected void showBefore() {
        System.out.println("```Upomnienie````");
    }
    protected void showAfter() {

    }
}
