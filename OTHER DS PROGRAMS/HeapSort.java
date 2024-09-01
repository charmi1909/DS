public class HeapSort {
    
    
    public static void heapSort(int[] array) {
        int n = array.length;

        
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        
        for (int i = n - 1; i >= 0; i--) {
           
            swap(array, 0, i);

            
            heapify(array, i, 0);
        }
    }

    
    private static void heapify(int[] array, int n, int i) {
        int largest = i;        
        int left = 2 * i + 1;   
        int right = 2 * i + 2;  

        
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }

        
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        
        if (largest != i) {
            swap(array, i, largest);

            
            heapify(array, n, largest);
        }
    }

    
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    
    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Original array:");
        printArray(array);

        heapSort(array);

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
