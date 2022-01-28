package test.sorting_algos;

import com.example.sorting_algos.BubbleSort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

  private BubbleSort bubbleSort;

  @BeforeEach
  void setUp() {
    bubbleSort = new BubbleSort();
  }

  @Test
  void test_1() {
    int[] arr = {0, -4, -1, 45, 4, 100, 450};
    int[] act = bubbleSort.bubble_sort(arr);
    int[] exp = {-4, -1, 0, 4, 45, 100, 450};
    assertArrayEquals(exp, act);
  }

}