import java.util.Scanner;

public class Ferenhit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Celsius temprature");
        double Celsius=sc.nextDouble();

        double Ferenhit;
        Ferenhit =((Celsius*9)/5)+32;
        System.out.println("Ferenhit:"+Ferenhit);
    }
    }

