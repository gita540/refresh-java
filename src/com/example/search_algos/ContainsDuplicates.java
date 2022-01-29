package com.example.search_algos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
/*Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
*/
public class ContainsDuplicates {

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
    ContainsDuplicates obj = new ContainsDuplicates();
    boolean res = obj.contains_dups(nums);
    if (res) {
      System.out.println("array contains duplicates");
    } else {
      System.out.println("no dups");
    }
  }

  //Time Complexity: 0(n^2)
  public boolean contains_dups_brute_force(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {

      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] == nums[j]) {
          count++;
        }
      }
    }
    if (count > 0) {
      return true;
    }
    return false;
  }

  //Time Complexity : 0(n)
  //Space Complexity: O(1)
  public boolean contains_dups(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (set.contains(nums[i])) {
        return true;
      } else {
        set.add(nums[i]);
      }
    }
    return false;
  }

}
