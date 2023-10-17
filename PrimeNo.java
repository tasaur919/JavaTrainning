package JavaTrainning.Loop;
import java.util.*;
public class PrimeNo {
    public static void main(String[] args) {

        //divide 1 and itself known as prime number

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number=");
        int n=sc.nextInt();
        int count=0;
        int c=n;
        for(int i=0;i<n;i++){
           int prime=sc.nextInt();

           
           for(int j=2;j<=prime;j++){
            if(prime%j==0){
                count++;

            }

           }
           if(count==0){
            System.out.println("Prime Number");
           }
           else{
            System.out.println("Not Prime Number");
           }
        }
       

    }
    
}
