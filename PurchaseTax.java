package JavaTrainning.CanditionalCase;

import java.util.Scanner;

public class PurchaseTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Total amount of Purchase=");
        float n=sc.nextFloat();
        if(n<1000){
            System.out.println("No Discount");
        }
        else if(n>=1000 && n<5000){
            System.out.println("total bill"+n);
            float Discount=(n*5)/100;
            n=n-Discount;
            System.out.println("Amount of Discount="+Discount);
            System.out.println("Pay for money after discount="+n);
        }
        else if(n>=5000 && n<10000){
            System.out.println("total bill"+n);
            float Discount1=(n*10)/100;
            n=n-Discount1;
            System.out.println("Amount of Discount="+Discount1);
            System.out.println("Pay for money after discount="+n);
        
        }
        else if(n>10000 && n<20000){
            System.out.println("total bill"+n);
            float Discount2=(n*15)/100;
            n=n-Discount2;
            System.out.println("Amount of Discount="+Discount2);
            System.out.println("Pay for money after discount="+n);
        
        }
        else{
            System.out.println("total bill"+n);
            float Discount3=(n*25)/100;
            n=n-Discount3;
            System.out.println("Amount of Discount="+Discount3);
            System.out.println("Pay for money after discount="+n);
        
        }
    }
    
}
