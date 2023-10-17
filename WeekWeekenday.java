package JavaTrainning.SwitchCase;

import java.util.Scanner;

public class WeekWeekenday {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
   
    
    System.out.println("enter your daya=");
      String a= sc.nextLine();
      String newa=a.toLowerCase();

    switch (newa) {
      case "sunday":

        System.out.println("Sunday is weekend Day");
        break;

      case "monday":
        System.out.println("Monday is week Day");
        break;
      case "tuesday":
        System.out.println("Tuesday is week Day");
        break;

      case "wednesday":
        System.out.println("Wednesday is week Day");
        break;
      case "thirsday":
        System.out.println("Thirsday is week Day");
        break;
      case "friday":
        System.out.println("Friday is week Day");
        break;
      case "saturday":
        System.out.println("Saturday is week Day");
        break;
      default:
        System.out.println("Sorry,wrong option");
    }
  }

}
