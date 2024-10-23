package week7;

public class Practice{
    public static void main(String[] args) {
        Truck truck = new Truck();
        E_Truck e_truck = new E_Truck("E_Truck");
        truck.refuel();
        e_truck.refuel();
        e_truck.charge();
    }
}

interface Vehicle{
    void refuel();
}

interface Electric{
    void charge();
}

class Truck implements Vehicle{
    @Override
    public void refuel(){
        System.out.println("Truck refuel");
    }
}

class E_Truck implements Vehicle, Electric{
    String plate;
    E_Truck(String plate){
        this.plate = plate;
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + plate);
    }

    @Override
    public void charge(){
        System.out.println("Charging " + plate);
    }
}

//interface method: public abstract
//interface variable: public static final