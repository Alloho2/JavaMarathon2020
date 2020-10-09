package day18;

public class Task2 {

    public static void main(String[] args) {
        System.out.println(count(717771270));
    }

    public static int count(int i) {
        if (i < 7) return 0;
        if (i % 10 == 7) {
            return count(i / 10) + 1;
        }
        return count(i / 10);
    }
}
