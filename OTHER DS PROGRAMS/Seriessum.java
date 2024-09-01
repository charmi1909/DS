import java.util.Scanner;

public class Seriessum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

  System.out.println("Enter the no of terms ");
  int n = sc.nextInt();
  
  int sum = 0, i = 0;
  for (int j = 1; j <= n; j++) 
  {
   for (i = 1; i <= j; i++) 
   {
    sum = sum + i;
   }
   i = 1;
  }
  System.out.println("Sum of series = " + sum);
    }
    
}
