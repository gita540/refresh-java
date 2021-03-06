package test.random_problems;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import random_problems.ThreeSum;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.List;

class ThreeSumTest {
 ThreeSum threeSumObj;

  @BeforeEach
  void setUp() {
    threeSumObj = new ThreeSum();
  }

  @Test
  public void threeSumTest_1() {
    int[] arr = {1, 2, 3, 4, 0};
    List<Integer[]> act = threeSumObj.threeSum_BruteForce(arr, 6);
    List<Integer[]> exp = new ArrayList<>();
    exp.add(0, new Integer[]{1, 2, 3});
    exp.add(1, new Integer[]{2, 4, 0});
    System.out.println(exp);
    System.out.println(act);
    Assertions.assertEquals(exp.size(), act.size());
    assertThat(act.toArray(), equalTo(exp.toArray()));

  }

  @Test
  public void threeSumTest_2() {
    int[] arr = {4, 0, 6, 78, -1, 9, 1};
    List<Integer[]> act = threeSumObj.threeSum_BruteForce(arr, 10);
    List<Integer[]> exp = new ArrayList<>();
    exp.add(0, new Integer[]{4, 0, 6});
    exp.add(1, new Integer[]{0, 9, 1});

    Assertions.assertEquals(act.size(), exp.size());
    assertThat(act.toArray(), equalTo(exp.toArray()));
  }

  @Test
  public void threeSumTest_3() {
    int[] arr = {1, 0, -1, 5};
    List<Integer[]> act = threeSumObj.threeSum_BruteForce(arr, 0);
    List<Integer[]> exp = new ArrayList<>();
    exp.add(0, new Integer[]{1, 0, -1});
    Assertions.assertEquals(act.size(), exp.size());
    assertThat(act, contains(exp.toArray()));
  }

  @Test
  public void threeSumTest_4() {
    int[] arr = {1, 10, -1, 1};
    List<Integer[]> act = threeSumObj.threeSum_BruteForce(arr, 1);
    List<Integer[]> exp = new ArrayList<>();
    exp.add(0, new Integer[]{1, -1, 1});
    Assertions.assertEquals(act.size(), exp.size());
    assertThat(act, contains(exp.toArray()));
  }

  @Test
  public void threeSumTest4(){
    int[] arr = {4,6,7,10,15,8};
    List<Integer[]> act = threeSumObj.threeSum_Sorting(arr, 25);
    List<Integer[]> exp = new ArrayList<>();
    exp.add(0, new Integer[]{4,6,15});
    exp.add(1, new Integer[]{7,8,10});
    Assertions.assertEquals(act.size(), exp.size());
    assertThat(act, contains(exp.toArray()));
  }


}