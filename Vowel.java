package JavaTrainning.CanditionalCase;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a charactor value=");
        char chare=sc.next().charAt(0);
       // System.out.println(chare==a?"vowel":chare==A?"vowel":chare==o?"vowel":chare==O?"vowel":chare==i?"vowel":chare==I?"vowel":chare==e?"vowel":chare==E?"vowel":chare==u?"vowel":chare==U?"vowel":"Consonant");
        if(chare=='a'||chare=='A' || chare=='e'||chare=='E' || chare=='o'||chare=='O' || chare=='i'||chare=='I' || chare=='u'||chare=='U'){
            System.out.println("This is vowel");
        }else
        {
           System.out.println("This is consonant");
        }
    }
    
}
