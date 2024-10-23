package week7.business;
import week7.personal.Vehicle;

public class Truck extends Vehicle {
    void extendWarranty(int months){
        this.warranty += months;
    }

}
