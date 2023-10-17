package JavaTrainning;

import java.util.Scanner;

public class AreaOfRec {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter your breadth=");
        int b=sc.nextInt();
        System.out.print("Enter your height=" );
        int h=sc.nextInt();
        int Area=b*h;
        System.out.println("Area of rectangle="+Area);
    }
    
}
