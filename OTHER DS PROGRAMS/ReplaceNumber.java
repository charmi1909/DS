import java.util.Scanner;

public class ReplaceNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

       
        int[] numbers = new int[n];

        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

       
        System.out.print("Enter the number to replace: ");
        int numToReplace = scanner.nextInt();

        System.out.print("Enter the replacing number: ");
        int replaceWith = scanner.nextInt();

        
        int replaceIndex = -1;
        for (int i = 0; i < n; i++) {
            if (numbers[i] == numToReplace) {
                numbers[i] = replaceWith;
                replaceIndex = i;
                break; 
            }
        }

        
        System.out.println("Index of replaced number: " + replaceIndex);

        
        System.out.println("Final array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }
}
