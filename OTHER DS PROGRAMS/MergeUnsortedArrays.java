import java.util.Arrays;
import java.util.Scanner;

public class MergeUnsortedArrays {
    
    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        
        int[] mergedArray = new int[arr1.length + arr2.length];

        
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
       
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);

        return mergedArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }

        
        System.out.print("Enter the size of the second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size2];
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }

        
        int[] mergedArray = mergeArrays(array1, array2);

        
        System.out.println("Merged array: " + Arrays.toString(mergedArray));

        scanner.close();
    }
}
