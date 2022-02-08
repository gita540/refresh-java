package random_problems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input array length ");
    int n = sc.nextInt();
    int[] nums = new int[n];

    System.out.println("Enter array elements");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    System.out.println("How many positions to rotate array");
    int positions = sc.nextInt();
    System.out.println("Input Array rotation");
    System.out.println(Arrays.toString(nums));
    ArrayRotation obj = new ArrayRotation();
    int[] arr = obj.left_rotation(nums, positions);
    System.out.println("Input Array After Left Rotation By " + positions + " Positions :");
    System.out.println(Arrays.toString(arr));
    int[] arr1 = obj.left_rotation(nums, positions);
    System.out.println("Input Array After right Rotation By " + positions + " Positions :");
    System.out.println(Arrays.toString(arr1));
  }

  //Time complexity :O(n^2)
  public int[] left_rotation(int[] nums, int positions) {
    for (int i = 0; i < positions; i++) {
      int temp = nums[0];
      for (int j = 0; j < nums.length - 1; j++) {
        nums[j] = nums[j + 1];
      }
      nums[nums.length - 1] = temp;
    }
    return nums;
  }

  //Time complexity :O(n^2)
  public int[] right_rotation(int[] nums, int positions) {
      int temp;

      for (int i = 1; i <= positions; i++) {
        temp = nums[nums.length-1];

        for (int j = nums.length-1; j > 0; j--) {
          nums[j] = nums[j-1];
        }

        nums[0] = temp;
      }
    return nums;
  }

}
