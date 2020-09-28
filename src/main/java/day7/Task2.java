package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player("Вася");
        Player player2 = new Player("Петя");

        Player.info();

        while (player1.getStamina() >= 0) {
            player1.run();
        }
//        player1.run(); //проверка минуса
//        player1.run();
//        player1.run();
        Player.info();

        for (int i = 1; i < 8; i++) {
            new Player("Man" + i);
        }
    }
}
