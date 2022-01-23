package com.example.search_algos;

import java.util.Scanner;

/*Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.*/
public class FirstBadVersion {

  public static  final int BAD_VERSION = 4;
  public static  int NUM_OF_CALLS = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of versions as n (should greater than 4 for this case)");
    int n = sc.nextInt();

    FirstBadVersion obj = new FirstBadVersion();
    int res = obj.findFirstBadVersion_binarySearch(n);
    if (res == BAD_VERSION) {
      System.out.println("The first bad version is " + res);
    }
    System.out.println( "Number of calls using binary search : "+ NUM_OF_CALLS);
    int brute_force_res = obj.findBadVersion_Brute(n);
    if (brute_force_res == BAD_VERSION){
      System.out.println("Bad version.. "+ brute_force_res);
    }
    System.out.println( "Number of calls using brute force method:  "+ NUM_OF_CALLS);

  }

  //Time complexity: O(log n)
  public int findFirstBadVersion_binarySearch(int n) {
    int start = 1;
    int end = n;

    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (isBadVersion(mid)) {
        end = mid - 1;

      } else {
        start = mid + 1;
      }
    }
    return start;

  }
  //Time complexity: O(n)
  public int findBadVersion_Brute(int n) {
    while (n >= 1) {
      if (isBadVersion(n)) {
        n = n - 1;
      } else {
        return n + 1;
      }
    }
  return -1;
  }

  private boolean isBadVersion(int mid) {
    NUM_OF_CALLS++;
    if (mid >= BAD_VERSION) {
      return true;
    }
    return false;
  }
}
