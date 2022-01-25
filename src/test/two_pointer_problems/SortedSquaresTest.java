package test.two_pointer_problems;

import static org.junit.jupiter.api.Assertions.*;

import com.example.two_pointer_problems.SortedSquares;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SortedSquaresTest {

  private SortedSquares sortedSquares;

  @BeforeEach
  void setUp() {
    sortedSquares = new SortedSquares();
  }

  @Test
  void test_1() {
    int[] nums = {-4, -1, 0, 3, 10};
    int[] act = sortedSquares.sorted_squares(nums);
    int[] expected = {0, 1, 9, 16, 100};
    assertArrayEquals(expected, act);
  }

  @Test
  void test_2() {
    int[] nums = {2, 4, 5, 10};
    int[] act = sortedSquares.sorted_squares(nums);
    int[] expected = {4, 16, 25, 100};
    assertArrayEquals(expected, act);
  }

  @Test
  void test_3() {
    int[] nums = {2, 4, 5, 10};
    int[] act = sortedSquares.simple_solution(nums);
    int[] expected = {4, 16, 25, 100};
    assertArrayEquals(expected, act);
  }
}