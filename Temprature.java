package JavaTrainning.CanditionalCase;

import java.util.Scanner;

public class Temprature {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter celsious=");
        float cel=sc.nextFloat();
        float f=((cel*9)/5) +32;
        System.out.println("The fahrenheit="+f);
    }
    
}
