import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

        // Step 3: Regex Validation for Train ID and Cargo Code
        String trainId = "TRN-1234";      // Example valid input
        String cargoCode = "PET-AB";      // Example valid input

        // Define regex patterns
        Pattern trainIdPattern = Pattern.compile("TRN-\\d{4}");
        Pattern cargoCodePattern = Pattern.compile("PET-[A-Z]{2}");

        // Validate Train ID
        Matcher trainMatcher = trainIdPattern.matcher(trainId);
        if (trainMatcher.matches()) {
            System.out.println("\nTrain ID " + trainId + " is VALID.");
        } else {
            System.out.println("\nTrain ID " + trainId + " is INVALID.");
        }

        // Validate Cargo Code
        Matcher cargoMatcher = cargoCodePattern.matcher(cargoCode);
        if (cargoMatcher.matches()) {
            System.out.println("Cargo Code " + cargoCode + " is VALID.");
        } else {
            System.out.println("Cargo Code " + cargoCode + " is INVALID.");
        }
    }
}