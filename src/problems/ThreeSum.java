package problems;

import java.util.Arrays;
import java.util.Scanner;

/*Given an array of integers, find all triplets in the array that sum up to a given target value.You can assume that the input
array length is always >= 3 and there can be duplicates in the input.
Ex: Given an array arr and a target value target, return all triplets a, b, c such that a + b + c = target.*/
public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input array length - should be greater than or equal to 3");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter target ");
        int tar = sc.nextInt();
        sc.close();

        int[] res = threeSum_BruteForce(nums, tar);
        if (res != null) {
            System.out.println("Three Sum " + Arrays.toString(res));
        } else {
            System.out.println("No three sum ");
        }

    }

    //  Time complexity: O(n^2)
    public static int[] threeSum_BruteForce(int[] nums, int tar) {
        int[] res = new int[3];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == tar) {
                        res[0] = nums[i];
                        res[1] = nums[j];
                        res[2] = nums[k];
                        return res;
                    }
                }
            }
        }
        return null;
    }
}
