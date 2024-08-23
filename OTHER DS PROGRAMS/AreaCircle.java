import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter radius");
        int radius=sc.nextInt();

        double area=Math.PI*radius*radius;

        System.out.println("Area:"+area);
    }
}
