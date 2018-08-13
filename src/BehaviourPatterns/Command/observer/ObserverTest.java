package BehaviourPatterns.Command.observer;

public class ObserverTest {
    public static void main(String[] args) {
        RegisterUser registerUser = new RegisterUser();
        registerUser.registerObservers(new ActivationEmailSender());
        registerUser.register(new User("Tom", "lolo@o2.pl"));
    }
}
