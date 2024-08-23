import java.util.Scanner;
public class Bubble_sort {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num=sc.nextInt();
        int []arr= new int[num];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter array number arr["+i+"]: ");
            arr[i]=sc.nextInt();    
        }

        for(int i=0;i<(arr.length-1);i++){
            for(int j=0;j<=(arr.length-2);j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("the sorted arr is");  
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

