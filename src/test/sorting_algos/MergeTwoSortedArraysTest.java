package test.sorting_algos;

import static org.junit.jupiter.api.Assertions.*;

import com.example.sorting_algos.MergeTwoSortedArrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MergeTwoSortedArraysTest {

  MergeTwoSortedArrays mergeTwoSortedArrays;

  @BeforeEach
  void setUp() {
    mergeTwoSortedArrays = new MergeTwoSortedArrays();
  }

  @Test
  void test_1() {
    int[] arr1 = {1, 2, 4, 8};
    int[] arr2 = {3, 5, 6, 10};
    int[] exp = {1, 2, 3, 4, 5, 6, 8, 10};
    int[] act = mergeTwoSortedArrays.mergeSortedArrays(arr1, arr2);
    assertArrayEquals(exp, act);
  }

  @Test
  void test_2() {
    int[] arr1 = {-1, 0, 4, 8};
    int[] arr2 = {3, 5, 6, 10};
    int[] exp = {-1, 0, 3, 4, 5, 6, 8, 10};
    int[] act = mergeTwoSortedArrays.mergeSortedArrays(arr1, arr2);
    assertArrayEquals(exp, act);
  }

  @Test
  void test_3() {
    int[] arr1 = {10, 30, 40, 80};
    int[] arr2 = {1, 4, 5, 9};
    int[] exp = {1, 4, 5, 9, 10, 30, 40, 80};
    int[] act = mergeTwoSortedArrays.mergeSortedArrays(arr1, arr2);
    assertArrayEquals(exp, act);
  }

}