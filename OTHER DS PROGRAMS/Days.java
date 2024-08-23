import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter days: ");
        int day = sc.nextInt();

        
        int years = (day/ 365);
        int weeks = (day % 365) / 7;
        int days  = (day % 365) % 7;

        
        System.out.println("Year/s = " + years);
        System.out.println("Week/s = " + weeks);
        System.out.println("Day/s  = " + days);
    }
}
