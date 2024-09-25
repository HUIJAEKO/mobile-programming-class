package week3;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number;
        number=input.nextInt();

        if(number<1){
            System.out.println("number is negative integer");
        }else{
            System.out.println("input is" + number);
        }

    }
}
