package structuralPattern.bridge;

public class Main {
    public static void main(String[] args) {
        Resource resource = new AlbumResources(
                "Mirage",
                "Mirage.jpg",
                "first Song",
                "armada"
                );
        View shortView = new ShortView(resource);
        View longView = new LongView(resource);
        longView.show();
        shortView.show();
    }
}
