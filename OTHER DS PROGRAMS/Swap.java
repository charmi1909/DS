import java.util.Scanner;

public class Swap {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("enter 1st number");
        int a=sc.nextInt();

        System.out.println("Enter 2nd number");
        int b=sc.nextInt();
        swap(a,b);
    }
    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("swap number a:"+a);
        System.out.println("swap number b:"+b);
    }
    

}
