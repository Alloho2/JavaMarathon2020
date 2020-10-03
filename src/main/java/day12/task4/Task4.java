package day12.task4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(Arrays.asList("Василий", "Петр", "Гоша"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Николай", "Оля", "Маша"));

        MusicBand musicBandOld = new MusicBand("Кукушки", 2002, list1);
        MusicBand musicBandNew = new MusicBand("Птицы", 2020, list2);
        MusicBand.printMembers(musicBandOld);
        MusicBand.printMembers(musicBandNew);
        MusicBand.transferMembers(musicBandOld, musicBandNew);
        MusicBand.printMembers(musicBandNew);
    }
}
