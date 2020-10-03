package day12.task5;

import java.util.*;

//Дополнительно сделана альтернатива (через разные конструкторы) с инициализацией списка артистов
// + добавление и удаление артиста из группы через методы, проверка на наличие артиста в группе.
public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year) {
        members = new ArrayList<>();
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
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

    public List<MusicArtist> getMembers() {
        return members;
    }

    @Override
    public String toString() {
        return "Группа: " +
                "Имя= " + name +
                " год основания= " + year;
    }

    public void addBand(MusicArtist artist) {
        if (!artist.isBand()) {
            if (artist.getRole() != null) {
                System.out.println(artist.getName() + " принят в группу " + name + " на позицию " + artist.getRole());
            } else {
                System.out.println(artist.getName() + " принят в группу " + name);
            }
            members.add(artist);
            artist.setiIsBand(true);
        } else System.out.println(artist.getName() + " Уже состит в группе и не может быть добавлен");
    }

    public void removeFromBand(MusicArtist artist) {
        if (artist.isBand()) {
            members.remove(artist);
            artist.setiIsBand(false);
            System.out.println(artist.getName() + " ушел из группы " + name);
        } else System.out.println(artist.getName() + " Не состит в группе");
    }


    public static void transferMembers(MusicBand musicBandOne, MusicBand musicBandTwo) {
        System.out.println("Группа " + musicBandOne.name + " перешла полностью в группу " + musicBandTwo.name);
        musicBandTwo.members.addAll(0, musicBandOne.members);
        musicBandOne.members.clear();
    }

    public static void printMembers(MusicBand musicBand) {
        System.out.println("Состав группы " + musicBand.name + ":");
        musicBand.members.forEach(a -> System.out.println(a.toString()));
    }
}
