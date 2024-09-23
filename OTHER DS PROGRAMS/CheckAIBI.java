import java.util.Scanner;

public class CheckAIBI {

    
    public static boolean isAIBI(String str) {
        int countA = 0;
        int countB = 0;
        boolean foundB = false;

        for (char ch : str.toCharArray()) {
            if (ch == 'a') {
                if (foundB) {
                    
                    return false;
                }
                countA++;
            } else if (ch == 'b') {
                foundB = true;
                countB++;
            } else {
                
                return false;
            }
        }

        
        return countA == countB && countA > 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isAIBI(input)) {
            System.out.println("The string is of the form a^i b^i.");
        } else {
            System.out.println("The string is NOT of the form a^i b^i.");
        }

        scanner.close();
    }
}
