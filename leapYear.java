package JavaTrainning.CanditionalCase;
import java.util.*;

public class leapYear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter start value=");
        int n=sc.nextInt();
        System.out.println(n%100==0 &&n%400==0?"Leap Year":n%4==0?"Leap Year":"Not a Leap Year");

        
    }
    
}
