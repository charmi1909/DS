import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        
        System.out.println("enter array elemnts");

        int array[] = new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Array:");
        for(int i=0;i<size;i++){
            System.out.println(array[i]);
        }
        
    }
    
}
