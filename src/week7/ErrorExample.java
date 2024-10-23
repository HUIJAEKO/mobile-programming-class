package week7;

public class ErrorExample {
    public static void main(String[] args) {
        int numerator = 100, denominator = 0, result = 0;

        try{
            result = divide(numerator, denominator);
        }catch (ArithmeticException e){
            System.out.println("[EXCEPTION] " + e.getMessage());
            e.printStackTrace();
            return;
        }
        System.out.println("RESULT " + result);
    }

    static int divide(int numerator, int denominator){
        if(denominator == 0){
            throw new ArithmeticException("Divide by zero");
        }else{
            return numerator / denominator;
        }
    }
}
