package JavaTrainning.Pattern;

import java.util.Scanner;

public class Dimond {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your value");
        int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++){
            System.out.print("*");
        }
        
       
        
System.out.println();
    }
    //int m=n;
   for(int i=n-1;i>=1;i--){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int k=1;k<=(2*i-1);k++){
            System.out.print("*");
        }
     System.out.println();
    }
}
}
