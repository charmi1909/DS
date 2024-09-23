import java.util.Scanner;
import java.util.Stack;

public class PostfixEvaluator {

    
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        
        for (char c : expression.toCharArray()) {
            
            if (Character.isDigit(c)) {
                stack.push(c - '0'); 
            } 
            
            else {
                int b = stack.pop(); 
                int a = stack.pop();
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
        
        System.out.print("Enter a postfix expression: ");
        String postfixExpression = scanner.nextLine();

        int result = evaluatePostfix(postfixExpression);
        System.out.println("The result of the postfix expression is: " + result);

        scanner.close();
    }
}
