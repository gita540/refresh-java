package test.search_algos;

import static org.junit.jupiter.api.Assertions.*;

import com.example.search_algos.FindInsertPosition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FindInsertPositionTest {

  private FindInsertPosition findInsertPosition;

  @BeforeEach
  void setUp() {
    findInsertPosition = new FindInsertPosition();
  }

  @Test
  void test_1() {
    int[] nums = {12, 45, 56, 78, 99};
    int tar = 100;
    int act = findInsertPosition.searchInsert(nums, tar);
    assertEquals(5, act);
  }

  @Test
  void test_2() {
    int[] nums = {12, 45, 56, 78, 99};
    int tar = 10;
    int act = findInsertPosition.searchInsert(nums, tar);
    assertEquals(0, act);
  }

  @Test
  void test_3() {
    int[] nums = {12, 45, 56, 78, 99};
    int tar = 60;
    int act = findInsertPosition.searchInsert(nums, tar);
    assertEquals(3, act);
  }
}