package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<String> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Группа: " +
                "Имя= " + name +
                " год основания= " + year;
    }

    public static void transferMembers(MusicBand musicBandOne, MusicBand musicBandTwo) {
        System.out.println("Группа " + musicBandOne.name + " перешла полностью в группу " + musicBandTwo.name);
        musicBandTwo.members.addAll(0, musicBandOne.members);
        musicBandOne.members.clear();
    }

    public static void printMembers(MusicBand musicBand) {
        System.out.println("Состав группы: ");
        musicBand.members.forEach(System.out::println);
    }
}
