package JavaTrainning.Pattern;

public class RightTriHolo {
    public static void main(String[] args) {
        
  
    int n=7;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++)
        {
            if(i==1|| j==1 ||i==j ||i==n||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
      }
}
