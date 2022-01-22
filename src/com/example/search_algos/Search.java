package com.example.search_algos;

import java.util.Scanner;

/*Given an array of integers nums and an integer target,
 write a function to search target in nums. If target exists, then return its index. Otherwise, return -1*/
public class Search {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter list to search");
    int n = input.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter array elements");
    for (int i = 0; i < n; i++) {
      nums[i] = input.nextInt();
    }
    System.out.println("Enter target to find ");
    int tar = input.nextInt();
    Search obj = new Search();
    int res = obj.linear_search(nums, tar);
    if (res == -1) {
      System.out.println("Target element is not present in the array");
    } else {
      System.out.println("Found target element at an index : " + res);
    }
    input.close();
  }

  //  Time complexity: O(n)
  public int linear_search(int[] nums, int target) {
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      }
    }
    return -1;
  }

  //Given an array of sorted integers, find the target element
  //Time complexity: O(log n)
  public int binary_search(int[] nums, int target) {
    int high = nums.length - 1;
    int low = 0;
    int mid = high + (high - low) / 2;
    while (low < high) {
      if (nums[mid] == target) {
        return mid;
      }
      if (nums[mid] < target) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return -1;
  }
}
