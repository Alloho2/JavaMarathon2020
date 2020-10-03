package day12.task5;

public class Task5 {
    public static void main(String[] args) {
        MusicBand musicBandOld = new MusicBand("Кукушки", 2002);
        MusicBand musicBandNew = new MusicBand("Птицы", 2020);

        MusicArtist musicArtistVasya = new MusicArtist("Василий",20, "гитарист");
        MusicArtist musicArtistPetr = new MusicArtist("Петр", 25,"гитарист");
        MusicArtist musicArtistGosha = new MusicArtist("Гоша",24, "бас-гитарист");
        MusicArtist musicArtistKolya = new MusicArtist("Николай", 26,"баc-гитарист");
        MusicArtist musicArtistOlya = new MusicArtist("Оля", 22,"солистка");
        MusicArtist musicArtistMasha = new MusicArtist("Маша",19, "солистка");
        MusicArtist musicArtistIlya = new MusicArtist("Илья",23, "ударник");
        MusicArtist musicArtistMikhail = new MusicArtist("Михаил", 18,"ударник");
        MusicArtist musicArtistKostya = new MusicArtist("Константин",19);
        MusicArtist musicArtistLenya = new MusicArtist("Леонид",29);

        musicBandNew.addBand(musicArtistKostya);
        musicBandOld.addBand(musicArtistVasya);
        musicBandOld.addBand(musicArtistPetr);
        musicBandOld.addBand(musicArtistGosha);
        musicBandOld.addBand(musicArtistKolya);
        musicBandNew.addBand(musicArtistOlya);
        musicBandNew.addBand(musicArtistMasha);
        musicBandNew.addBand(musicArtistIlya);
        musicBandNew.addBand(musicArtistMikhail);
        MusicBand.printMembers(musicBandOld);
        MusicBand.printMembers(musicBandNew);
        MusicBand.transferMembers(musicBandOld, musicBandNew);
        MusicBand.printMembers(musicBandNew);
        musicBandNew.removeFromBand(musicArtistMikhail);
        musicBandNew.addBand(musicArtistMikhail);
    }
}

