package JavaTrainning.Loop;

import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        // Anagram means we hava a tring like "mary" but uses anagram to check "army"
        //charactor same but position change known as Anagram
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your String=");
        String n=sc.nextLine();
        System.out.print("Enter To compare String=");
        String c=sc.nextLine();
        int count=0;
        for(int i=0;i<n.length();i++){
            for(int j=0;j<=c.length();j++){
               if(j==i){
                count++;

               }
            }
        }
        if(count==n.length()){
            System.out.println("This is Anagram");
        }
        else{
            System.out.println("Not anagram");
        }
        


    }
    
}
