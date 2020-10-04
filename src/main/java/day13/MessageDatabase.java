package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void sendMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        messages.stream().filter(a -> a.getSender().getName().contains(u1.getName()) &&
                a.getReceiver().getName().contains(u2.getName()) || a.getSender().getName().contains(u2.getName()) &&
                a.getReceiver().getName().contains(u1.getName()))
                .forEach(a -> System.out.println(a.getSender().getName() + ": " + a.getText()));
    }
}
