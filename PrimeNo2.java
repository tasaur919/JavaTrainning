package JavaTrainning.Loop;

import java.util.Scanner;

public class PrimeNo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //divid 1 and itself known as Prime number
        
        System.out.print("Enter your value=");
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("Prime number");
        }
        else{
            System.out.println("Not a Prime number");
        }
    }
    
}
