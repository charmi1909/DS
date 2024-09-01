import java.util.Scanner;

class Employee_Detail{
        int Employee_Id;
        String Name;
        String Designation;
        double Salary;

        Employee_Detail(){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Employee Id");
            this.Employee_Id=sc.nextInt();

            sc.nextLine();

            System.out.println("Enter Employee Name");
            this.Name=sc.nextLine();

            System.out.println("Enter Employee Designation");
            this.Designation=sc.nextLine();

            System.out.println("Enter Employee Salary");
            this.Salary=sc.nextDouble();
        }
        void display(){
            System.out.println(this.Employee_Id);
            System.out.println(this.Name);
            System.out.println(this.Designation);
            System.out.println(this.Salary);

        }
    }
  public class Employee{
            public static void main(String[] args) {
                
                Employee_Detail ep=new Employee_Detail();
                ep.display();
            }
  }

