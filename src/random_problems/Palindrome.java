package random_problems;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

  public static void main(String[] args) {
    System.out.print("Enter any string:");
    Scanner in = new Scanner(System.in);
    String inputString = in.nextLine();
    in.close();
    Palindrome obj = new Palindrome();
    String reverseString = obj.rev_string_stack(inputString);
    String revString = obj.rev_string_two_pointer(inputString);
    System.out.println(obj.isPalindrome(inputString,revString));

  }

  public boolean isPalindrome(String inputString, String revString) {
    if (inputString.equals(revString)) {
      System.out.println("The input String is a palindrome.");
      return true;
    } else {
      System.out.println("The input String is not a palindrome.");
    }
    return false;
  }

  //Time complexity :O(2n)
  //Space complexity: O(n)
  public String rev_string_stack(String inputString) {
    Stack stack = new Stack();

    for (int i = 0; i < inputString.length(); i++) {
      stack.push(inputString.charAt(i));
    }
    String reverseString = "";

    while (!stack.isEmpty()) {
      reverseString = reverseString + stack.pop();
    }
    return reverseString;
  }


  //Time complexity : O(n/2)
  public String rev_string_two_pointer(String str) {
    int left = 0;
    int right = str.length() - 1;
    char temp;
    char[] charArray = str.toCharArray();
    while (left <= right) {
      temp = charArray[left];
      charArray[left] = charArray[right];
      charArray[right] = temp;
      left++;
      right--;
    }
    String s = new String(charArray);
    return s;
  }
}
