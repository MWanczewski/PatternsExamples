package structuralPattern.bridge;

public class AlbumResources implements Resource{
    private String header;
    private String image;
    private String listOfSongs;
    private String publisher;

    public AlbumResources(String header, String image, String listOfSongs, String publisher) {
        this.header = header;
        this.image = image;
        this.listOfSongs = listOfSongs;
        this.publisher = publisher;
    }

    @Override
    public String getHeader() {
        return this.header;
    }

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public String getContent() {
        return listOfSongs;
    }

    @Override
    public String getFooter() {
        return publisher;
    }
}
