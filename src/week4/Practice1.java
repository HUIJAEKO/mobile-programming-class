package week4;

public class Practice1 {
    public static void main(String[] args) {
        Vehicle sedan = new Vehicle("Porche Panamera GTS", 0.14, 90);
        Vehicle coupe = new Vehicle("Porche 911 GTS", 0.12, 64);

        System.out.println("There are " + "" + "vehicles.");
    }
}

class Vehicle {
    String plate;
    double gas_per_distance, gas_liters;

    Vehicle() {
        this.plate = "TBD";
        this.gas_per_distance = 0;
        this.gas_liters = 0;
    }

    Vehicle(String plate, double gas_per_distance, double gas_liters) {
        this.plate = plate;
        this.gas_per_distance = gas_per_distance;
        this.gas_liters = gas_liters;
    }
}
