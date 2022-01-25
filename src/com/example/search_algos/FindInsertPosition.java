package com.example.search_algos;

import java.util.Scanner;

/*Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.*/
public class FindInsertPosition {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter how many elements in array ");
    int n = input.nextInt();
    int[] nums = new int[n];
    System.out.println("Enter array elements");
    for (int i = 0; i < n; i++) {
      nums[i] = input.nextInt();
    }

    System.out.println("Enter target to find ");
    int tar = input.nextInt();
    input.close();
    FindInsertPosition obj = new FindInsertPosition();
     int res = obj.searchInsert(nums, tar);
    System.out.println(res);
  }

  public int searchInsert(int[] nums, int tar) {
    int high = nums.length - 1;
    int low = 0;

    while (low <= high) {
      int mid = low + (high - low) / 2;
      if (nums[mid] == tar) {
        return mid;
      } else if (nums[mid] < tar) {
        low = mid + 1;
      } else {
        high = mid - 1;
      }
    }
    return low;
  }

}
