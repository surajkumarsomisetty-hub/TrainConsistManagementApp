import java.util.ArrayList;
import java.util.List;

class GoodsBogie {
    private String type;
    private String cargo;

    public GoodsBogie(String type, String cargo) {
        this.type = type;
        this.cargo = cargo;
    }

    public String getType() {
        return type;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public String toString() {
        return type + " carrying " + cargo;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        System.out.println("=== Train Consist Management App ===");

        // Step 1: Create a List of Goods Bogies
        List<GoodsBogie> goodsBogies = new ArrayList<>();
        goodsBogies.add(new GoodsBogie("Cylindrical", "Petroleum")); // valid
        goodsBogies.add(new GoodsBogie("Rectangular", "Coal"));      // valid
        goodsBogies.add(new GoodsBogie("Cylindrical", "Coal"));      // invalid

        // Step 2: Display goods bogies
        System.out.println("\nGoods Bogies in Train:");
        for (GoodsBogie bogie : goodsBogies) {
            System.out.println(bogie);
        }

        // Step 3: Safety Compliance Check using Streams
        boolean isSafe = goodsBogies.stream()
                .allMatch(b -> {
                    if (b.getType().equalsIgnoreCase("Cylindrical")) {
                        return b.getCargo().equalsIgnoreCase("Petroleum");
                    }
                    return true; // Non-cylindrical bogies can carry any cargo
                });

        // Step 4: Display result
        if (isSafe) {
            System.out.println("\nTrain is SAFETY COMPLIANT");
        } else {
            System.out.println("\nTrain is NOT SAFETY COMPLIANT");
        }
    }
}