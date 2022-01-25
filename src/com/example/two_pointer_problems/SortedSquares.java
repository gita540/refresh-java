package com.example.two_pointer_problems;

import java.util.Arrays;
import java.util.Scanner;

/*Given an array of both positive and negative integers ‘arr[]’ which are sorted.
 The task is to sort the square of the numbers of the Array. */
public class SortedSquares {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter how many elements in array ");
    int n = input.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter array elements in increasing order");
    for (int i = 0; i < n; i++) {
      nums[i] = input.nextInt();
    }
    input.close();
    SortedSquares obj = new SortedSquares();
    int[] res = obj.sorted_squares(nums);
    for (int i : res) {
      System.out.print(i + " ");
    }

  }

  //Two pointer technique
  // Time complexity: O(n)
  // Space complexity: O(n)
  public int[] sorted_squares(int[] nums) {
    int left = 0;
    int right = nums.length - 1;
    int[] res = new int[nums.length];
    for (int i = nums.length - 1; i >= 0; i--) {
      if (Math.abs(nums[left]) > nums[right]) {
        res[i] = nums[left] * nums[left];
        left++;
      } else {
        res[i] = nums[right] * nums[right];
        right--;
      }
    }
    return res;
  }

  public int[] simple_solution(int[] nums) {
    for (int i = 0; i <= nums.length - 1; i++) {
      nums[i] = nums[i] * nums[i];
    }
    Arrays.sort(nums);
    return nums;
  }
}
