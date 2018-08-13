package BehaviourPatterns.Command.template.abstractClassExample;

public class MonochromaticPrinter extends Printer{
    @Override
    void getInk() {
        System.out.println("załadowano czarny tusz");
    }

    @Override
    void loadPaper() {
        System.out.println("pobrano kartka A4");
    }

    @Override
    void prepareDocument() {
        System.out.println("zmieniono kolory obrazu na wersje monochromatyczną");
    }

    @Override
    void printDocument() {
        System.out.println("brrr, brrr");
    }
}
