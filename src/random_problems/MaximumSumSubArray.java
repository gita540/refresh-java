package random_problems;

import java.util.Scanner;

public class MaximumSumSubArray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input array length ");
    int n = sc.nextInt();
    int[] nums = new int[n];

    System.out.println("Enter array elements");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    sc.close();
    MaximumSumSubArray ob = new MaximumSumSubArray();
    ob.maxSumSubArray(nums);
  }

  //Time Complexity: O(N^3)
  private void maxSumSubArray(int[] nums) {
    int sum;
    int maxSum = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      // Pick ending point
      for (int j = i; j < nums.length; j++) {
        sum = 0;
        // Print subarray between current starting
        // and ending points
        for (int k = i; k <= j; k++) {
          sum = sum + nums[k];
          System.out.print(nums[k] + " ");
        }
        System.out.println();
        if (sum > maxSum) {
          maxSum = sum;
        }
      }
    }
    System.out.println("MAX SUM IS+ " + maxSum);
  }

}
