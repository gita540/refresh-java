package test.random_problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import random_problems.Palindrome;

class PalindromeTest {
  private Palindrome palindromeObj;

  @BeforeEach
  void setUp() {
    palindromeObj = new Palindrome();
  }

  @Test
  void rev_string_two_pointer() {
    String str = "mom";
    Assertions.assertEquals("mom",palindromeObj.rev_string_two_pointer(str));
  }

  @Test
  void rev_string_stack() {
    String str = "mom";
    Assertions.assertEquals("mom",palindromeObj.rev_string_stack(str));
  }

  @Test
  void is_palindrome_1() {
    Assertions.assertFalse(palindromeObj.isPalindrome("car","rac"));
  }

  @Test
  void is_palindrome() {
    Assertions.assertTrue(palindromeObj.isPalindrome("mom","mom"));
  }
}