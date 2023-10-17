package JavaTrainning.Loop;

import java.util.Scanner;


public class CountDigit {
    public static void main(String[] args) {
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value");
        int n=sc.nextInt();
        while(n>0){
          // int r=n%10; 
          count++;
          n=n/10;
        
        }
        System.out.println("Count digit is="+count);
    }
    
}
