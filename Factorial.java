package JavaTrainning.Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Factorial means 5!=5*4*3*2*1=120

        System.out.print("enter your value=");
        int n=sc.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
           fac*=i;

        }
        System.out.println("Factorial="+fac);
    }
    
}
