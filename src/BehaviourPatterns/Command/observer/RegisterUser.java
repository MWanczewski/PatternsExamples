package BehaviourPatterns.Command.observer;

import java.util.ArrayList;
import java.util.List;

public class RegisterUser {
    private List<User> database = new ArrayList<>();
    private List<Observer> observators = new ArrayList<>();
    void register(User user) {
        database.add(user);
    }
    public void registerObservers(Observer observer) {
        observators.add(observer);
    }
    public void unregisterObservers(Observer observer) {
        observators.remove(observer);
    }
    private void notifyObservers(User user) {
        for (Observer o : observators) {
            o.update(user);
        }
    }
}
