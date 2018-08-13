package BehaviourPatterns.Command.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CalculatorParser {
    List<Expresion> parse(String value) {
        List<Expresion> expresions = new ArrayList<>();
        String[] split = value.split("");
        for(String s : split) {
            if(s.equals("+")) {
                Expresion plusExpresion = new PlusNumbersExpresion();
                expresions.add(plusExpresion);
            } else {
                Expresion e = new AddNumberExpresion(Integer.valueOf(s));
                expresions.add(e);
            }
        }
        return expresions;
    }
    public void evaluate() {
        Stack<Integer> context = new Stack<>();
        List<Expresion> parse = parse("3 4 +");
        for (Expresion expresion : parse) {
            expresion.interpret(context);
        }
        System.out.println(context.pop());
        List<Expresion> parse2 = parse("3 +");
    }
}
