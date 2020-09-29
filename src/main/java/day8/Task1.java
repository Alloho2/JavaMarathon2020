package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String st = "";
        //замеряем время работы Builder
        long startStringBuilder = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            sb.append(i).append(" ");
        }
        System.out.print(sb);
        long endStringBuilder = System.currentTimeMillis();
        //замеряем время работы String
        long startString = System.currentTimeMillis();
        for (int i = 0; i < 20_000; i++) {
            st += (i + " ");
        }
        System.out.println(st + "\n");
        long endString = System.currentTimeMillis();

        System.out.println("Время Bilder: " + (endStringBuilder - startStringBuilder));
        System.out.println("Время String: " + (endString - startString));
    }


}
