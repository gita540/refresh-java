package com.example.sorting_algos;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter how many elements are in array ");
    int n = input.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter array elements ");
    for (int i = 0; i < n; i++) {
      nums[i] = input.nextInt();
    }
    BubbleSort obj = new BubbleSort();
    int[] res = obj.bubble_sort(nums);
    System.out.println(Arrays.toString(res));
  }

  //Time complexity : O(n^2)
  public int[] bubble_sort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length - 1; j++) {
        if (nums[j] > nums[j + 1]) {
          int temp = nums[j];
          nums[j] = nums[j + 1];
          nums[j + 1] = temp;
        }
      }
    }
    return nums;
  }
}
