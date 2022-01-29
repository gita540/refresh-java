package test.search_algos;

import static org.junit.jupiter.api.Assertions.*;

import com.example.search_algos.ContainsDuplicates;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ContainsDuplicatesTest {

  private ContainsDuplicates containsDuplicatesTest;

  @BeforeEach
  void setUp() {
    containsDuplicatesTest = new ContainsDuplicates();
  }

  @Test
  void test_1() {
    int[] arr = {1, 2, 4, 6, 7};
    assertFalse(containsDuplicatesTest.contains_dups(arr));
  }

  @Test
  void test_2() {
    int[] arr = {1, 2, 4, 2, 7};
    assertTrue(containsDuplicatesTest.contains_dups(arr));
  }

  @Test
  void test_3() {
    int[] arr = {1, 2, 4, 6, 7};
    assertFalse(containsDuplicatesTest.contains_dups_brute_force(arr));
  }

  @Test
  void test_4() {
    int[] arr = {1, 2, 4, 2, 7};
    assertTrue(containsDuplicatesTest.contains_dups_brute_force(arr));
  }
}