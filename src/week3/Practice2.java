package week3;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        int count;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many Fibonacci series to be shown: ");
        count = input.nextInt();

        if(count<1){
            System.out.println("Enter the positive number");
        }else{
            for(int i=1; i<count+1; i++){
                System.out.print(fibonacci2(i)+" ");
            }
        }
    }

    static int fibonacci(int n){
        if(n==1 || n==2){
            return 1;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    static int fibonacci2(int n){
        int f1=1, f2=1, fn=0;
        if(n==1 || n==2){
            return 1;
        }else {
            for (int i = 3; i < n + 1; i++) {
                fn = f1 + f2;
                f1 = f2;
                f2 = fn;
            }
        }
        return fn;
    }
}


