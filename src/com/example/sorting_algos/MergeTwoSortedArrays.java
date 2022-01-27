package com.example.sorting_algos;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoSortedArrays {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter how many elements are in array-1 ");
    int n = input.nextInt();
    int[] nums1 = new int[n];
    System.out.println("Enter array-1 elements in increasing order");
    for (int i = 0; i < n; i++) {
      nums1[i] = input.nextInt();
    }
    System.out.println("Enter how many elements are in array-2 ");
    int m = input.nextInt();
    int[] nums2 = new int[m];
    System.out.println("Enter array-1 elements in increasing order");
    for (int i = 0; i < m; i++) {
      nums2[i] = input.nextInt();
    }

    MergeTwoSortedArrays obj = new MergeTwoSortedArrays();
    int[] sorted_array = obj.mergeSortedArrays(nums1, nums2);
    System.out.println(Arrays.toString(sorted_array));
  }

  public int[] mergeSortedArrays(int[] nums1, int[] nums2) {
    int i = 0;
    int j = 0;
    int k = 0;
    int[] res = new int[nums1.length + nums2.length];
    while (i < nums1.length && j < nums2.length) {
      if (nums1[i] < nums2[j]) {
        res[k++] = nums1[i++];
      } else {
        res[k++] = nums2[j++];
      }
    }
    while (i <= nums1.length - 1) {
      res[k++] = nums1[i++];
    }
    while (j <= nums2.length - 1) {
      res[k++] = nums2[j++];
    }
    return res;
  }

}
