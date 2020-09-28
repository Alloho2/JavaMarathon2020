package day7;

public class Player {
    private String name;
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countPlayers = 0;

    public Player(String name) {
        this.name = name;
        this.stamina = (int) (Math.random() * 11) + 90;
        goingToField();
    }

    public int getStamina() {
        return stamina;
    }

    public void goingToField() {
        if (countPlayers >= 6) {
            System.out.println("На поле нет свободных мест");
        } else {
            countPlayers++;
            System.out.println("Игрок " + name + " выходит на поле с выносливостью: " + stamina);
        }
    }

    public void run() {
        stamina--;
        if (stamina < 0) return;
        if (stamina == MIN_STAMINA) {
            System.out.println("Выносливость игрока " + name + " упала до " + MIN_STAMINA + ", игрок уходит с поля");
            countPlayers--;
        }
    }

    public static void info() {
        switch (countPlayers) {
            case 0:
            case 1:
                System.out.println("На поле свободно " + (6 - countPlayers) + " мест");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("На поле свободно " + (6 - countPlayers) + " места");
                break;
            case 5:
                System.out.println("На поле свободно 1 место");
                break;
        }
    }
}

