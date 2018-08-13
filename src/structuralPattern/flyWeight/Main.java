package structuralPattern.flyWeight;

import javax.swing.text.AbstractDocument;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        DocumentParser parser = new DocumentParser();
        DocumentFlyWeightFactory factory = new DocumentFlyWeightFactory(parser);
        Document doc1 = factory.getDocument("plik1", "instrukcja obslugi psa");
        Document doc2 = factory.getDocument("plik2", "instrukcja obslugi kota");
        Document doc3 = factory.getDocument("plik1", "instrukcja obslugi psa");
        System.out.println("Doc1 = Doc2 ? " + (doc1 == doc2));
        System.out.println("Doc1 = Doc3 ? " + (doc1 == doc3));


    }
}
