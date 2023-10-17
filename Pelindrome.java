package JavaTrainning.Loop;

import java.util.Scanner;

public class Pelindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // if we have input is  1331. and we get output is also 1331.   

        System.out.print("Enter your value=");
        int n=sc.nextInt();
        int sum=0 ,v;
        v=n;
        while(n>0){
            int r=n%10;
           sum=(sum*10)+r;
           n=n/10;
        }
        if(v==sum){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    
    }
    
}
