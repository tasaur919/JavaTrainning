package JavaTrainning.Loop;

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        System.out.print("Enter your String=");
         String n=sc.nextLine();
         int count=0;
        for(int i=0;i<n.length();i++){
            count++;
            
        }
        System.out.println("Total Charactor is="+count);
    }
    
}
