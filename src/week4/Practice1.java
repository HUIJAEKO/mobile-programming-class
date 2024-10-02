package week4;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        Vehicle sedan = new Vehicle("Porche Panamera GTS", 0.14, 90);

        System.out.println("There are " + Vehicle.getVehicles() + "vehicles.");
        System.out.println("gas_per_distance is: " + sedan.getGas_per_distance());
    }
}

class Vehicle {
    private String plate;
    private double gas_per_distance, gas_liters;
    private static int vehicles=0;

    Vehicle() {
        this.plate = "TBD";
        this.gas_per_distance = 0;
        this.gas_liters = 0;
        vehicles++;
    }

    Vehicle(String plate, double gas_per_distance, double gas_liters) {
        this.plate = plate;
        this.gas_per_distance = gas_per_distance;
        this.gas_liters = gas_liters;
        vehicles++;
    }

    static int getVehicles() {return vehicles;}
    String getPlate(){return this.plate;}
    double getGas_per_distance(){return this.gas_per_distance;}
    double getGas_liters(){return this.gas_liters;}

    void setPlate(String plate){this.plate = plate;}
    void setGas_per_distance(double gas_per_distance){this.gas_per_distance = gas_per_distance;}
    void setGas_liters(double gas_liters){this.gas_liters = gas_liters;}
}
