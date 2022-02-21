package com.example.sorting_algos;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter how many elements are in array ");
    int n = input.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter array elements ");
    for (int i = 0; i < n; i++) {
      nums[i] = input.nextInt();
    }
    input.close();
    SelectionSort sc = new SelectionSort();
    int[] res = sc.selection_sort(nums);
    System.out.println(Arrays.toString(res));
  }
  //Time Complexity: O(n^2)
  public int[] selection_sort(int[] nums) {
    for (int i = 0; i < nums.length-1; i++) {
      // Find the minimum element in unsorted array
      int min_idx = i;
      for (int j = i+1; j < nums.length; j++){
        if (nums[j] < nums[min_idx])
          min_idx = j;
      }

      int temp = nums[min_idx];
      nums[min_idx] = nums[i];
      nums[i] = temp;
    }

    return nums;
  }

}
