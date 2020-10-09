package day18;

public class Task2 {
    static int result = 0;

    public static void main(String[] args) {
        System.out.println(count(717771778));
    }

    public static int count(int i) {

        if (i < 1) return 0;
        if (i % 10 == 7) {
            result++;
        }
        count(i / 10);
        return result;
    }
}
