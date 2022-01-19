package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import problems.ThreeSum;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSumTest {

    @Test
    public void threeSumTest_1() {
        int[] arr = {2, 0, 16, 78, 0, 9, 1};
        List<Integer[]> res = ThreeSum.threeSum_BruteForce(arr, 12);
        Integer[] exp = new Integer[]{2, 9, 1};
        List<Integer[]> expRes = new ArrayList<>(Arrays.<Integer[]>asList(exp));
        Assertions.assertEquals(expRes.size(),res.size());
        assertThat(expRes, contains(res.toArray()));
    }

    @Test
    public void threeSumTest_2() {
        int[] arr = {4, 0, 6, 78, 0, 19, 1};
        List<Integer[]> res = ThreeSum.threeSum_BruteForce(arr, 88);
        Integer[] exp = new Integer[]{4, 6, 78};
        List<Integer[]> expRes = new ArrayList<>(Arrays.<Integer[]>asList(exp));
        Assertions.assertEquals(expRes.size(),res.size());
        assertThat(expRes, contains(res.toArray()));
    }

    @Test
    public void threeSumTest_3() {
        int[] arr = {1, 0, -1, 5};
        List<Integer[]> res = ThreeSum.threeSum_BruteForce(arr, 0);
        Integer[] exp = new Integer[]{1,0,-1};
        List<Integer[]> expRes = new ArrayList<>(Arrays.<Integer[]>asList(exp));
        Assertions.assertEquals(expRes.size(),res.size());
        assertThat(expRes, contains(res.toArray()));
    }

    @Test
    public void threeSumTest_4() {
        int[] arr = {1, 10, -1, 1};
        List<Integer[]> res = ThreeSum.threeSum_BruteForce(arr, 1);
        Integer[] exp = new Integer[]{1, -1, 1};
        List<Integer[]> expRes = new ArrayList<>(Arrays.<Integer[]>asList(exp));
        Assertions.assertEquals(expRes.size(),res.size());
        assertThat(expRes, contains(res.toArray()));
    }
}