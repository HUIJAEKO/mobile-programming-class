package week6;

public class Practice1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Vehicle");
        Vehicle truck = new Truck("Truck");
        Vehicle e_truck = new E_Truck("E_Truck");

        //Object class 활용하기
        System.out.println(e_truck);

        vehicle.refuel();
        truck.refuel();
        e_truck.refuel();

//        e_truck.charge(); 타입 문제로 에러
//        다운캐스팅과 업캐스팅차이?
//        ((E_Truck)e_truck).charge();
    }
}

class Vehicle{
    String plate;
    Vehicle(String plate){
        this.plate = plate;
    }
    void refuel(){
        System.out.println("plate: " + plate + "\n-[FUEL] Gasoline");
    }
    @Override
    public String toString() {
        return "Plate: " + plate;
    }
}

class Truck extends Vehicle{
    Truck(String plate) {
        super(plate);
    }
    @Override
    void refuel(){
        System.out.println("plate: " + plate + "\n-[FUEL] Disel");
    }
}

class E_Truck extends Vehicle{
    E_Truck(String plate) {
        super(plate);
    }
    @Override
    void refuel(){
        System.out.println("plate: " + plate + "\n-[FUEL] Electric");
    }

    void charge(){
        System.out.println("plate: " + plate + "\n-[STATUE] Charging");
    }
}
