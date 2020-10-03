package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bandList = Arrays.asList(new MusicBand("Nirvana", 1987),
                new MusicBand("DDT", 1980), new MusicBand("Metallica", 1981),
                new MusicBand("Песняры", 1969), new MusicBand("Kino", 1990),
                new MusicBand("Apocalyptica", 1993), new MusicBand("65daysofstatic", 2001),
                new MusicBand("Мураками", 2004), new MusicBand("Порнофильмы", 2008),
                new MusicBand("КняZz", 2011), new MusicBand("The Kooks", 2004));
        Collections.shuffle(bandList);
        System.out.println(bandList);
        System.out.print(groupsAfter2000(bandList));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        return bands.stream().filter(a -> a.getYear() > 2000).collect(Collectors.toList());
    }
}
