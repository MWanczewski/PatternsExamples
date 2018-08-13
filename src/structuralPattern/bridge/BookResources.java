package structuralPattern.bridge;

public class BookResources implements Resource {
    private String header;
    private String image;
    private String shortDescription;
    private String publisher;

    public BookResources(String header, String image, String shortDescription, String publisher) {
        this.header = header;
        this.image = image;
        this.shortDescription = shortDescription;
        this.publisher = publisher;
    }

    @Override
    public String getHeader() {
        return this.header;
    }

    @Override
    public String getImage() {
        return this.image;
    }

    @Override
    public String getContent() {
        return this.shortDescription;
    }

    @Override
    public String getFooter() {
        return this.publisher;
    }
}
