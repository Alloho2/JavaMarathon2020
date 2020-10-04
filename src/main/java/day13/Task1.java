package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Вася");
        User user2 = new User("Петя");
        User user3 = new User("Маша");
        user1.sendMessage(user2, "ПРИВЕТ!!!");
        user1.sendMessage(user2, "КАК ДЕЛА???");
        user2.sendMessage(user1, "HI!!!");
        user2.sendMessage(user1, "Все нормально");
        user2.sendMessage(user1, "а у тебя?");
        user3.sendMessage(user1, "tex1");
        user3.sendMessage(user1, "text2");
        user3.sendMessage(user1, "text3");
        user1.sendMessage(user3, "re1");
        user1.sendMessage(user3, "re2");
        user1.sendMessage(user3, "re3");
        user3.sendMessage(user1, "rere1");

        MessageDatabase.showDialog(user1, user3);
    }
}
