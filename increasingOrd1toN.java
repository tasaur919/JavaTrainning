package JavaTrainning.Pattern;

public class increasingOrd1toN {
    public static void main(String[] args) {
        int n=5;
        int sum=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(sum+" ");
                sum++;
            }
            System.out.println();
        }

    }
    
}
