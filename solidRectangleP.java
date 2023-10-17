package JavaTrainning.Pattern;

import java.util.Scanner;

public class solidRectangleP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number of Rows=");
        int Rows=sc.nextInt();
        System.out.print("Enter number of column=");
        int col=sc.nextInt();

        for(int i=0;i<Rows;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
