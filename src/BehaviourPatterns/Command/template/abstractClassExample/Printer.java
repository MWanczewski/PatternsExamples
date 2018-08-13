package BehaviourPatterns.Command.template.abstractClassExample;

abstract class Printer {
    abstract void getInk();
    abstract void loadPaper();
    abstract void prepareDocument();
    abstract void printDocument();
    void print() {
        prepareDocument();
        loadPaper();
        getInk();
        printDocument();
    }
}
