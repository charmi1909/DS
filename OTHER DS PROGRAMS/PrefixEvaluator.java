import java.util.Scanner;
import java.util.Stack;

public class PrefixEvaluator {

    
    public static int evaluatePrefix(String expression) {
        Stack<Integer> stack = new Stack<>();

        
        for (int i = expression.length() - 1; i >= 0; i--) {
            char c = expression.charAt(i);

            
            if (Character.isDigit(c)) {
                stack.push(c - '0'); 
            } 
            
            else {
                int a = stack.pop(); 
                int b = stack.pop();
                switch (c) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }
        
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a prefix expression: ");
        String prefixExpression = scanner.nextLine();

        int result = evaluatePrefix(prefixExpression);
        System.out.println("The result of the prefix expression is: " + result);

        scanner.close();
    }
}
