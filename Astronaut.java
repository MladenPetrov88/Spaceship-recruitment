package SpaceStationRecruitment;

public class Astronaut {
    String name;
    int age;
    String country;

    public Astronaut(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("Astronaut: %s, %d %s", name, age, country);
    }
}
