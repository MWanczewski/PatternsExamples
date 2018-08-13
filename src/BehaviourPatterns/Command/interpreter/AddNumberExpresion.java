package BehaviourPatterns.Command.interpreter;

import java.util.Stack;

public class AddNumberExpresion implements Expresion{
    private Integer value;

    public AddNumberExpresion(Integer value) {
        this.value = value;
    }

    @Override
    public void interpret(Stack<Integer> context) {
        context.push(value);
    }
}
