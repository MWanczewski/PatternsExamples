package BehaviourPatterns.Command.template.interfaceExample;

public interface Printer {
    void getInk();

    void loadPaper();

    void prepareDocument();

    void printDocument();

    default void print() {
        prepareDocument();
        loadPaper();
        getInk();
        printDocument();
    }
}
