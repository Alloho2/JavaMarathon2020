package day18;

public class Task1 {
    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println(recursionSum(numbers, 0));

    }

    public static int recursionSum(int[] ints, int num) {

        if (num == ints.length) return 0;

        return ints[num] + recursionSum(ints, num + 1);

    }
}