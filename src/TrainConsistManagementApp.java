import java.util.ArrayList;
import java.util.List;

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

        // Step 1: Create a List of Bogies
        List<Bogie> bogies = new ArrayList<>();
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 54));
        bogies.add(new Bogie("First Class", 24));

        // Step 2: Display bogies
        System.out.println("\nBogies in Train:");
        for (Bogie bogie : bogies) {
            System.out.println(bogie);
        }

        // Step 3: Aggregate seating capacity using reduce()
        int totalSeats = bogies.stream()
                .map(Bogie::getCapacity)       // extract capacity
                .reduce(0, Integer::sum);      // sum capacities

        // Step 4: Display total seating capacity
        System.out.println("\nTotal Seating Capacity in Train: " + totalSeats);
    }
}