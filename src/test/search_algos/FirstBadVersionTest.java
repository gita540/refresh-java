package test.search_algos;

import static org.junit.jupiter.api.Assertions.*;

import com.example.search_algos.FirstBadVersion;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstBadVersionTest {

  private FirstBadVersion firstBadVersion;

  @BeforeEach
  void setUp() {
    firstBadVersion = new FirstBadVersion();
  }

  @Test
  void test_1() {
    int act = firstBadVersion.findFirstBadVersion_binarySearch(8);
    assertEquals(FirstBadVersion.BAD_VERSION, act);
  }

  @Test
  void test_2() {
    int act = firstBadVersion.findFirstBadVersion_binarySearch(10);
    assertEquals(FirstBadVersion.BAD_VERSION, act);
  }

  @Test
  void test_3() {
    int act = firstBadVersion.findBadVersion_Brute(5);
    assertEquals(FirstBadVersion.BAD_VERSION, act);
  }

}