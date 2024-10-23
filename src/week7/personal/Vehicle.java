package week7.personal;

public class Vehicle {
    String plate;
    protected int warranty;

    //main method에서 사용해야하기 때문에 public access modifier
    public void setPlate(String plate) {
        this.plate = plate;
    }


    //    public void setWarranty(int warranty) {
//        this.warranty += warranty;
//    }
}
