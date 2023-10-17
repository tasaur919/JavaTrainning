package JavaTrainning;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
      System.out.print("Enter your first");
        int b=sc.nextInt();
          System.out.print("Enter your second");
        int c=sc.nextInt();
        b=b+c;
        c=b-c;
        b=b-c;
        System.out.println(b);
        System.out.println(c);

    }
}
