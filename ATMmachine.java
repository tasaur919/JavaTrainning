package JavaTrainning.SwitchCase;
import java.util.*;
public class ATMmachine {
public static void main(String[] args){ 
    int balance=2000;
        Scanner sc=new Scanner(System.in);
        while(true){
        System.out.println("Enter 1 for check balance");
        System.out.println("Enter 2 for Deposit");
        System.out.println("Enter 3 for withddraw");
        System.out.println("Enter 4 for Exit!");
        System.out.print("Enter your choice=");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Currenct balance="+balance);
                break;
            case 2:{
               System.out.print("enter your amount=");
               int amount=sc.nextInt();
               balance +=amount;
                System.out.println("Currenct balance after Deposit="+balance);
                break;
               }
            case 3:{
                System.out.print("Enter your amount=");
                int c=sc.nextInt();
                balance -=c;
              System.out.println("Currenct balance after withdraw="+balance);
              break;  }
                
            case 4:
             System.exit(choice);

             
            default:
            System.out.println("Sorry, wrong choice");
        
        }
    }
    }
    
}
