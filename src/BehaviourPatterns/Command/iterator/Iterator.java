package BehaviourPatterns.Command.iterator;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Iterator {
    private static Object BufferedReader;

    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");
        java.util.Iterator<String> iteraror = list.iterator();
        while(iteraror.hasNext()) {
            String next = iteraror.next();
        }
    }

    public static void main2(String[] args) throws FileNotFoundException {
        BufferedReader = new BufferedReader(new FileReader("ioj.txt"));
    }
}
