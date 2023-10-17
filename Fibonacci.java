package JavaTrainning.Loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // fibonacci means 0 1 1 2 3 5 8 13 21...... Generate new no. add two previous  no

        int a=0,b=1,c=0;
        System.out.print("Enter your value=");
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
    
}
