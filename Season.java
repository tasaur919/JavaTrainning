package JavaTrainning.SwitchCase;
import java.util.*;
public class Season {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("1 or 2 or 3 or 4 for Spring");
       System.out.println("5 or 6 or 7 or 8 for Summer");
       System.out.println("9 or 10 or 11 or 12 for Fall");
       System.out.print("Enter your choice=");
       int Season=sc.nextInt();
       switch(Season){
        case 1:  
        case 2:
        case 3:
        case 4:
        System.out.println("It is Spring Season");
        break;
         case 5:  
        case 6:
        case 7:
        case 8:
        System.out.println("It is Summer Season");
        break;
        case 9:  
        case 10:
        case 11:
        case 12:
        System.out.println("It is Fall Season");
        break;
        default:
        System.out.println("Sorry, Wrong information");

       } 
    }
    
}
