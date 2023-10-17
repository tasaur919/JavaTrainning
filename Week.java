package JavaTrainning.CanditionalCase;
import java.util.*;
public class Week {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value between 1 to 7 for days=");
        int n=sc.nextInt();
        System.out.println(n==1?"Sunday":n==2?"Monday":n==3?"Tuesday":n==4?"Wednesday":n==5?"Thirsday":n==6?"Friday":n==7?"Saturday":"Sorry,Enter again betwee 1 to 7");
    }
    
}
