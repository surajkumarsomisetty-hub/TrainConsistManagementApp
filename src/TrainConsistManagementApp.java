import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Bogie {
    private String name;
    private int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return name + " Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));


        List<Bogie> highCapacityBogies = bogies.stream()
                .filter(b -> b.getCapacity() > 60) // condition
                .collect(Collectors.toList());


        System.out.println("\nFiltered Bogies (Capacity > 60):");
        for (Bogie bogie : highCapacityBogies) {
            System.out.println(bogie);
        }
    }
}