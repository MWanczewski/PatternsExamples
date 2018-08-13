package structuralPatern.Adapter;

import java.util.ArrayList;
import java.util.List;

public class HipHopAlbum implements Album {
    List<String> songs =new ArrayList<>();

    @Override
    public String front() {
        return "Okadka";
    }

    @Override
    public List<String> ListOfSongs() {
        return songs;
    }
}
