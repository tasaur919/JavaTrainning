package JavaTrainning;

import java.util.Scanner;

public class GreatestVal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your a value=");
        int a=sc.nextInt();
        System.out.print("Enter your b value=");
        int b=sc.nextInt();
        System.out.print("Enter your c value=");
        int c=sc.nextInt();
     //   System.out.print(a>b && a>c? a:c  +  b>c && b>a ? + b:c);
     System.out.println(a>b && a>c?"a is large"+a:b>c?"b is large"+b:"c is large"+c);
    }
    
}
