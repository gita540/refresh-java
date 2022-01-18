package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problems.ThreeSum;
import problems.TwoSum;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    public void threeSumTest_1() {
        int[] arr = {4, 0, 6, 78, 0, 9, 1};
        int[] act = ThreeSum.threeSum_BruteForce(arr, 11);
        int[] exp = new int[]{4, 6, 1};
        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void threeSumTest_2() {
        int[] arr = {4, 0, 6, 78, 0, 9, 1};
        int[] act = ThreeSum.threeSum_BruteForce(arr, 10);
        int[] exp = new int[]{4, 0, 6};
        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void threeSumTest_3() {
        int[] arr = {1, 0, -1, 1};
        int[] act = ThreeSum.threeSum_BruteForce(arr, 0);
        int[] exp = new int[]{1, 0, -1};
        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void threeSumTest_4() {
        int[] arr = {1, 0, -1, 1};
        int[] act = ThreeSum.threeSum_BruteForce(arr, 1);
        int[] exp = new int[]{1, -1, 1};
        Assertions.assertArrayEquals(exp, act);
    }
}