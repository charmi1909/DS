public class ShellSort {

    
    public static void shellSort(int[] array) {
        int n = array.length;
        
        
        for (int gap = n / 2; gap > 0; gap /= 2) {
            
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                
                
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }
                
                
                array[j] = temp;
            }
        }
    }

    
    public static void main(String[] args) {
        int[] array = { 12, 34, 54, 2, 3 };

        System.out.println("Original array:");
        printArray(array);

        shellSort(array);

        System.out.println("Sorted array:");
        printArray(array);
    }

    
    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
