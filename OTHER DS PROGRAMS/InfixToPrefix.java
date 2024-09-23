import java.util.Stack;

public class InfixToPrefix {

    // Method to check if the given character is an operator
    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^';
    }

    // Method to return the precedence of operators
    private static int precedence(char c) {
        switch (c) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }

    // Method to convert infix expression to prefix
    public static String infixToPrefix(String infix) {
        // Reverse the infix expression
        StringBuilder reversedInfix = new StringBuilder(infix).reverse();
        StringBuilder prefix = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < reversedInfix.length(); i++) {
            char c = reversedInfix.charAt(i);

           
            if (Character.isLetterOrDigit(c)) {
                prefix.append(c);
            } 
            
            else if (c == ')') {
                stack.push(c);
            } 
            
            else if (c == '(') {
                while (!stack.isEmpty() && stack.peek() != ')') {
                    prefix.append(stack.pop());
                }
                stack.pop(); 
            } 
            
            else if (isOperator(c)) {
                while (!stack.isEmpty() && precedence(stack.peek()) > precedence(c)) {
                    prefix.append(stack.pop());
                }
                stack.push(c);
            }
        }

        
        while (!stack.isEmpty()) {
            prefix.append(stack.pop());
        }

        
        return prefix.reverse().toString();
    }

    public static void main(String[] args) {
        String infixExpression = "A+B*(C^D-E)";
        String prefixExpression = infixToPrefix(infixExpression);
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Prefix Expression: " + prefixExpression);
    }
}
