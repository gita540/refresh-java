package com.example.sorting_algos;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

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
    InsertionSort obj = new InsertionSort();
    int[] res = obj.insertion_sort(nums);
    System.out.println(Arrays.toString(res));
  }

  // Time Complexity : O(n2)
  // Space complexity :O(1)
  public int[] insertion_sort(int[] nums) {
    for (int i =1; i<nums.length; i++){
      int j = i-1;
      int key = nums[i];
      while ( j >=0 && nums[j]>key){
        nums[j+1]= nums[j];
        j= j-1;
      }
      nums[j+1]=key;
    }
    return nums;
  }

}
