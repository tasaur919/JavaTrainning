package JavaTrainning.Loop;
import java.util.*;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //Even meas Divisible by 2, odd means not divisible by 2.

        System.out.print("Enter Start value=");
        int a=sc.nextInt();
        System.out.print("Enter last value=");
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
            if(i%2==0){
                System.out.println("This is Even"+i);
            }
            else{
                System.out.println("This is Odd");
            }
        }
    }
    
}
