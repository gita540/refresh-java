package test.sorting_algos;

import static org.junit.jupiter.api.Assertions.*;

import com.example.sorting_algos.InsertionSort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InsertionSortTest {
 private InsertionSort insertionSort;
  @BeforeEach
  void setUp() {
    insertionSort = new InsertionSort();
  }

  @Test
  void test_1(){
    int[] arr = {0, -4, -1, 45, 4, 100, 450};
    int[] act = insertionSort.insertion_sort(arr);
    int[] exp = {-4, -1, 0, 4, 45, 100, 450};
    assertArrayEquals(exp, act);
  }
}