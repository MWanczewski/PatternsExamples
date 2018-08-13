package structuralPattern.facadeClient;

import structuralPattern.Facade.Facade;

public class Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        String s = facade.showProject("Mark","ksadasd", "ksadasd","ksadasd","ksadasd");
        System.out.println(s);
    }
}
