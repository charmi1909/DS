import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter character");
        char c=sc.next().charAt(0);

        if(c=='a'|| c=='i'||c=='e'||c=='o'||c=='u'||c=='A'|| c=='I'||c=='E'||c=='O'||c=='U')
 {
    System.out.println("vowel");
 }   
 else{
    System.out.println("consonant");
 }
    
    }
    
}
