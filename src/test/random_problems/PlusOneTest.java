package test.random_problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import random_problems.PlusOne;

class PlusOneTest {

  private PlusOne plusOne;

  @BeforeEach
  void setUp() {
    plusOne = new PlusOne();
  }

  @Test
  void plusOne_test_1() {
    int[] inp = {1, 2, 3};
    Assertions.assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(inp));
  }

  @Test
  void plusOne_test_2() {
    int[] inp = {1, 2, 9};
    Assertions.assertArrayEquals(new int[]{1, 3, 0}, plusOne.plusOne(inp));
  }

  @Test
  void plusOne_test_3() {
    int[] inp = {9, 9, 9};
    Assertions.assertArrayEquals(new int[]{1, 0, 0, 0}, plusOne.plusOne(inp));
  }
}