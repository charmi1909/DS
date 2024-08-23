import java.util.Scanner;
public class Power{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter base:");
        int base=sc.nextInt();

        System.out.println("Enter power:");
        int power=sc.nextInt();

        int result=1;

        for(int i=0;i<power;i++){
            result=result*base;
        }
        System.out.println("Answer:"+result);
    }
}