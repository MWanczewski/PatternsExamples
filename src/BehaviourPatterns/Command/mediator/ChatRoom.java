package BehaviourPatterns.Command.mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoom {
    private Map<String, User> participtians= new HashMap<>();
    public void register (User user) {
        user.setChatRoom(this);
        participtians.put(user.getName(), user);
    }
    public void send(User from, String to, String message) {
        User user = participtians.get(to);
        //user.notify(from.getName());
        user.recive(from.getName(), message);
    }
}
