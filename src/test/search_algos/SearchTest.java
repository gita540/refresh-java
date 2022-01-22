package test.search_algos;

import static org.junit.jupiter.api.Assertions.*;

import com.example.search_algos.Search;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearchTest {

  Search search;

  @BeforeEach
  void setUp() {
    search = new Search();
  }

  @Test
  void testTargetPresentInArray() {
    int[] nums = {1, 8, 7, 9, 67, 100};
    int act = search.linear_search(nums, 100);
    assertEquals(5, act);
  }

  @Test
  void testTargetNotPresentInArray() {
    int[] nums = {1, 8, 7, 9, 67, 100};
    int act = search.linear_search(nums, 10);
    assertEquals(-1, act);
  }

  @Test
  void testTargetPresentInArray_Binary_Search_1() {
    int[] nums = {1, 8, 20,45,99,100};
    int act = search.linear_search(nums, 8);
    assertEquals(1, act);
  }

  @Test
  void testTargetPresentInArray_Binary_Search_2() {
    int[] nums = {1, 8, 20,45,99,100};
    int act = search.linear_search(nums, 100);
    assertEquals(5, act);
  }
  @Test
  void testTargetPresentInArray_Binary_Search_3() {
    int[] nums = {1, 8, 20,45,99,100};
    int act = search.linear_search(nums, 45);
    assertEquals(3, act);
  }

  @Test
  void testTargetPresentInArray_Binary_Search_4() {
    int[] nums = {1, 8, 20,45,99,100};
    int act = search.linear_search(nums, 450);
    assertEquals(-1, act);
  }
}