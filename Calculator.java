package JavaTrainning.SwitchCase;
import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
       
       System.out.println("enter fist value=");
       int a=sc.nextInt();
       System.out.println("enter second value=");
       int b=sc.nextInt();
        System.out.print("Enter your choice +,-,/,*,%=");
        char choice=sc.next().charAt(0);
        switch(choice){
            case '+':
            
            System.out.println("sum="+(a+b));
            break;
            
             case '-':
            System.out.println("sub="+(a-b));
            break;
             case '/':
            System.out.println("div="+(a/b));
            break;
             case '*':
            System.out.println("multi="+(a*b));
            break;
             default:
            System.out.print("your choice is wrong");
            break;
        }
    
    }
    
}
