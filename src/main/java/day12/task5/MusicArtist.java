package day12.task5;

//Дополнительно сделана альтернатива (через разные конструкторы) введение роли музыканта в группе
// + добавление и удаление артиста из группы через методы

public class MusicArtist {
    private String name;
    private String role;
    private int age;
    private boolean isBand;

    public MusicArtist(String name, int age, String role) {
        this.name = name;
        this.role = role;
        this.age = age;
        isBand = false;
    }

    public MusicArtist(String name, int age) {
        this.name = name;
        this.age = age;
        isBand = false;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public boolean isBand() {
        return isBand;
    }

    public void setiIsBand(boolean band) {
        isBand = band;
    }

    @Override
    public String toString() {
        if (role == null) {
            return name + ", возраст " + age;
        } else return name + ", возраст " + age + ", позиция " + role;
    }
}

