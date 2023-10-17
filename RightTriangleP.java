package JavaTrainning.Pattern;

import java.util.Scanner;

public class RightTriangleP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of rows=");
        int row=sc.nextInt();
        System.out.print("Enter numbser of column=");
        int col=sc.nextInt();
       for(int i=0;i<row;i++){
        for(int j=0;j<i;j++){
            System.out.print("* ");
        }
System.out.println();

       }
    }
    
}
