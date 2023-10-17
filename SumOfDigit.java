package JavaTrainning.Loop;
import java.util.*;
public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your value=");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int r=n%10;
            sum+=r;
            n=n/10;

        }
        System.out.println("Digit sum="+sum);


    }
    
}
