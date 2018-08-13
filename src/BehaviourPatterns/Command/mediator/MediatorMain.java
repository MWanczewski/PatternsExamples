package BehaviourPatterns.Command.mediator;

public class MediatorMain {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        User user1 = new User("Tom");
        User user2 = new User("Mike");
        User user3 = new User("Bob");
        User user4 = new User("Steve");
        User user5 = new User("Jerry");
        chatRoom.register(user1);
        chatRoom.register(user2);
        chatRoom.register(user3);
        chatRoom.register(user4);
        chatRoom.register(user5);
        user1.send("Bob", "Halio!?");
    }
}
