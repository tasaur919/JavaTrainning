package JavaTrainning.Loop;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.print("Enter Start value=");
        int min=sc.nextInt();
        System.out.print("Enter last value");
        int max=sc.nextInt();
        for(int i=min;i<=max;i++){
            for(int j=2;j<i;j++){
                if(i%j==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println("Prime Numbes="+i);
            }
            else{
            flag=0;
            }
        }
    }
    
}
