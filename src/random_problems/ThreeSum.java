package random_problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
        ThreeSum obj = new ThreeSum();
        List<Integer[]> res = obj.threeSum_BruteForce(nums, tar);
        for (Integer[] triplets : res) {
            for (int num : triplets) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

    //  Time complexity: O(n^2)
    public  List<Integer[]> threeSum_BruteForce(int[] nums, int tar) {
        List<Integer[]> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == tar) {
                        res.add(new Integer[]{nums[i], nums[j], nums[k]});
                    }
                }
            }

        }
        return res;
    }

    // Time complexity: O(n^2)
    public List<Integer[]> threeSum_Sorting(int[] nums, int target) {
        List<Integer[]> result = new ArrayList<>();
        //sort input array
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == target) {
                    result.add(new Integer[] { nums[i], nums[left], nums[right] });
                    left++;
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
