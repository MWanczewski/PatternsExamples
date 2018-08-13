package BehaviourPatterns.Command.observer;

public class ActivationEmailSender implements Observer {

    @Override
    public void update(User user) {
        System.out.println("wysylano meila");
    }
}
