import java.util.Stack;

public class PalindromeChecker {

    
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        
        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false; 
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        
        String[] strings = {"aca", "bcb", "abcba", "abbcbba"};

        
        for (String str : strings) {
            if (isPalindrome(str)) {
                System.out.println(str + " is a palindrome.");
            } else {
                System.out.println(str + " is not a palindrome.");
       
            }
        }
    }
}