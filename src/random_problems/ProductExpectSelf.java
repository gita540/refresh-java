package problems;

import java.util.Arrays;
import java.util.Scanner;

public class ProductExpectSelf {

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
    ProductExpectSelf obj = new ProductExpectSelf();
    int[] res = obj.product_expect_self(nums);
    System.out.println(Arrays.toString(res));

  }

  public int[] product_expect_self(int[] nums) {
    int[] res = new int[nums.length];
    int j = 0;

    while(j<res.length) {
      int prod = 1;
      for (int i = j;i< nums.length; i++){
        prod = nums[i]*prod;
      }

      res[j++] = prod;

    }
    return res;
  }

}
