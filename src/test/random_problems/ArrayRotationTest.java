package test.random_problems;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import random_problems.ArrayRotation;

class ArrayRotationTest {
private ArrayRotation arrayRotation;
  @BeforeEach
  void setUp() {
    arrayRotation = new ArrayRotation();
  }

  @Test
  void left_rotation() {
    int[] arr = {1,2,3,4,5};
    Assertions.assertArrayEquals(new int[]{3, 4, 5, 1, 2},arrayRotation.left_rotation(arr,2));

  }

  @Test
  void right_rotation() {
    int[] arr = {1,2,3,4,5};
    Assertions.assertArrayEquals(new int[]{4, 5, 1, 2, 3},arrayRotation.right_rotation(arr,2));

  }
}