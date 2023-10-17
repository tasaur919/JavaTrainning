package JavaTrainning.CanditionalCase;

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your income=");
        float n=sc.nextFloat();

        if(n<10000){
           System.out.println("No tax charge!");
           
        }
        else if(n>=10000 && n<20000){
            System.out.println("Current Amount"+n);
            float tax=(n*10)/100;
            n=n-tax;
            System.out.println("10% Tax of current amt is="+tax);
            System.out.println("Remaining Amount after tax is="+n);   
        }
        else if(n>=20000 && n<30000){
            System.out.println("Current Amount"+n);
             float tax1=(n*15)/100;
            n=n-tax1;
            System.out.println("15% Tax of current amt is="+tax1);
            System.out.println("Remaining Amount after tax is="+n); 
        }
        else{
             System.out.println("Current Amount"+n);
             float tax2=(n*25)/100;
            n=n-tax2;
            System.out.println("25% Tax of current amt is="+tax2);
            System.out.println("Remaining Amount after tax is="+n);
        }
    }
    
}
