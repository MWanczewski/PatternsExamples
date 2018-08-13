package BehaviourPatterns.Command.mediator;

public class User {
    private String name;
    private ChatRoom chatRoom;
    public User(String name) {
        this.name = name;
    }
    public void send(String to, String message) {
        chatRoom.send(this, to, message);
    }
    public void recive(String from, String message) {
        System.out.println(name + " dostał wiadomość");
    }

    public String getName() {
        return name;
    }

    public ChatRoom getChatRoom() {
        return chatRoom;
    }

    public void setChatRoom(ChatRoom chatRoom) {
        this.chatRoom = chatRoom;
    }
}
