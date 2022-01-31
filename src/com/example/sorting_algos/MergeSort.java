package com.example.sorting_algos;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort {

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
    merge_sort(nums, nums.length);
    System.out.println(Arrays.toString(nums));
  }

  public static void merge_sort(int[] nums, int len) {
    if (len < 2) {
      return;
    }
    int mid = len / 2;
    int[] left_arr = new int[mid];
    int[] right_arr = new int[len - mid];
    int k = 0;
    for (int i = 0; i < len; ++i) {
      if (i < mid) {
        left_arr[i] = nums[i];
      } else {
        right_arr[k] = nums[i];
        k = k + 1;
      }
    }
    merge_sort(left_arr, mid);

    merge_sort(right_arr, len - mid);
     merge(left_arr,right_arr, nums,left_arr.length,right_arr.length);
  }

  public static void merge(int[] left_arr,int[] right_arr, int[] arr,int left_size, int right_size){

    int i=0,l=0,r = 0;
    //The while loops check the conditions for merging
    while(l<left_size && r<right_size){

      if(left_arr[l]<right_arr[r]){
        arr[i++] = left_arr[l++];
      }
      else{
        arr[i++] = right_arr[r++];
      }
    }
    while(l<left_size){
      arr[i++] = left_arr[l++];
    }
    while(r<right_size){
      arr[i++] = right_arr[r++];
    }
  }
}
