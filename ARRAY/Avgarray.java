 import java.util.Scanner;

public class Avgarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        int sum=0;
        

        for(int i=1;i<=n;i++){
            sum=sum+i;
        }
        double average=(double)(sum)/(n);
        System.out.println("average of numbers:"+average);
    }
    
}

