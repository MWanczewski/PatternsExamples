package BehaviourPatterns.Command.interpreter;

import java.util.Stack;

public interface Expresion {
    void interpret(Stack<Integer> context);
}
