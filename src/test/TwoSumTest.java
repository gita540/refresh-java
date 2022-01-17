package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import problems.TwoSum;

public class TwoSumTest {

    @Test
    public void twoSumTest() {
        int[] arr = {4, 5, 6, 78, 0};
        int[] act = TwoSum.twoSum(arr, 9);
        int[] exp = new int[]{0, 1};
        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void twoSumFailTest() {
        int[] arr = {4, 5, 6, 78, 0};
        int[] act = TwoSum.twoSum(arr, 12);
        Assertions.assertNull(act);
    }

    @Test
    public void twoSumSuccessTestBruteForce() {
        int[] inPut = {12, 3, 4, 0, 9};
        int[] exp = new int[]{2, 3};
        int[] act = TwoSum.twoSum_BruteForce(inPut, 4);
        Assertions.assertArrayEquals(exp, act);
    }

    @Test
    public void twoSumNegativeTestBruteForce() {
        int[] inPut = {12, 3, 4, 0, 9};
        int[] act = TwoSum.twoSum_BruteForce(inPut, 10);
        Assertions.assertNull(act);
    }
}