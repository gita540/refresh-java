package test.random_problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import random_problems.BracketValidator;

class BracketValidatorTest {
  private BracketValidator bracketValidator;

  @BeforeEach
  void setUp() {
    bracketValidator = new BracketValidator();
  }

  @Test
  void test_1(){
    assertTrue(bracketValidator.bracket_validator("[[]]"));
  }

  @Test
  void test_2(){
    assertFalse(bracketValidator.bracket_validator("[[]]}"));
  }

  @Test
  void test_3(){
    assertTrue(bracketValidator.bracket_validator("[[(){}]]"));
  }
}