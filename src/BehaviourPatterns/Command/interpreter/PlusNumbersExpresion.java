package BehaviourPatterns.Command.interpreter;

import java.util.Stack;

public class PlusNumbersExpresion implements Expresion {
    @Override
    public void interpret(Stack<Integer> context) {
        Integer value1 = context.pop();
        Integer value2 = context.pop();
        context.push(value1 + value2);
    }

}
