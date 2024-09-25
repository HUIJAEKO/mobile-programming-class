package week3;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        car.plate = "Porche 911";
        car.gas_per_distance = 0.12;
        car.gas_liters = 64.0;

        System.out.println("plate = " + car.plate);
        System.out.println("Gas left: " + car.gas_liters + "liters");
        
        do{
            System.out.print("how far do you want to drive: ");
            Scanner input = new Scanner(System.in);
            double distance = input.nextDouble();

            car.drive(distance);
            System.out.println("Gas left: " + car.gas_liters + "liters");
        }while(car.gas_liters > 0);
    }
}

class Vehicle{
    String plate = "TBD";

    double gas_per_distance = 0;
    double gas_liters = 0;

    void drive(double distance){
        gas_liters -= distance * gas_per_distance;
    }
}
