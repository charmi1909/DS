import java.util.Arrays;
import java.util.Scanner;

public class SortDelete {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter size of array");
		int size = sc.nextInt();

		System.out.println("enter elements of array");

		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp = 0;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("sorted array:" + Arrays.toString(arr));
		}
		
        

		System.out.println("enter index");
		int index=sc.nextInt();

        int []newarr=new int[size+1];

		for(int i=0;i<size;i++){
			newarr[i]=arr[i];
		}
		
		for(int i=index+1;i<size-1;i++){
			newarr[i]=arr[i-1];
		}
		for(int i=0;i<newarr.length-1;i++){
			System.out.println(newarr[i]);
		}

	}
}
