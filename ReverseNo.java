package JavaTrainning.Loop;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        // revers means 133 => 331

        System.out.print("Enter your value=");
        int n=sc.nextInt();
        int a,b=0;
        while(n>0){
               a=n%10;
               b=(b*10)+a;
               n=n/10;
        }
        System.out.println("Reverse is="+b);
    }
    
}
