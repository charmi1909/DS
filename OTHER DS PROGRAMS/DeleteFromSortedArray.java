import java.util.Arrays;
import java.util.Scanner;

public class DeleteFromSortedArray {
    
    public static int[] deleteNumber(int[] arr, int num) {
        
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println(num + " not found in the array.");
            return arr;
        }

        
        int[] newArr = new int[arr.length - 1];

        
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }

        
        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }

        return newArr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original array: " + Arrays.toString(sortedArray));
        System.out.print("Enter a number to delete: ");
        int numberToDelete = scanner.nextInt();

       
        int[] updatedArray = deleteNumber(sortedArray, numberToDelete);

        
        System.out.println("Updated array: " + Arrays.toString(updatedArray));
        
        scanner.close();
    }
}
