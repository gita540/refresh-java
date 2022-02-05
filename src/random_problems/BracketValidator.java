package random_problems;

import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BracketValidator {

  public static Map<Character, Character> map = Map.of('}', '{', ']', '[', ')', '(');

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter brackets to validate");
    String str = sc.nextLine();
    BracketValidator obj = new BracketValidator();
    System.out.println(obj.bracket_validator(str));
    sc.close();
  }

  public boolean bracket_validator(String str) {
    // Initialize a stack to be used in the algorithm.
    Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      // If the current character is a closing bracket.
      if (map.containsKey(ch)) {
        // Get the top element of the stack. If the stack is empty, set a dummy value of '*'
        char topChar = stack.empty() ? '*' : stack.pop();
        // If the mapping for this bracket doesn't match the stack's top element, return false.
        if (topChar != map.get(ch)) {
          return false;
        }
      } else {
        stack.push(ch);
      }
    }
    // If the stack still contains elements, then it is an invalid expression.
    return stack.isEmpty();

  }

}
