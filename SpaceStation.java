package SpaceStationRecruitment;



import Christmas.Present;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SpaceStation {
    String name;
    int capacity;
    List<Astronaut> data;

    public SpaceStation (String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }
    public int getCount() {
        return this.data.size();
    }

    public void add (Astronaut astronaut) {
        String name = "";
        if (this.data.size() < this.capacity) {
           this.data.add(astronaut);
        }
    }

    public boolean remove(String name) {
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                System.out.println(this.data.remove(i));
            }
        }
        return false;
    }

    public Astronaut getOldestAstronaut () {
        return data.stream().max(Comparator.comparingInt(Astronaut::getAge)).orElse(null);
    }

    public Astronaut getAstronaut (String name) {
        Astronaut astronaut = null;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i).getName().equals(name)) {
                astronaut = data.get(i);
            }
        }
        return astronaut;
    }

    public String report() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("Astronauts working at Space Station %s", name)).append(System.lineSeparator());
        this.data.forEach(e -> {
            sb.append(e.toString()).append(System.lineSeparator());
        });
        return sb.toString().trim();
    }
}
