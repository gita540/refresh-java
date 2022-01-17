package problems;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inpArray = {3, 5, 7, 0, 12};
        System.out.println("Enter target element");
        int target = sc.nextInt();
        int[] res = twoSum_BruteForce(inpArray, target);
        if (res != null) {
            System.out.println("two sum equals to target is " + Arrays.toString(res));
        } else {
            System.out.println("no target elements found for twoSum");
        }

    }

    //  Time complexity: O(n^2)
    public static int[] twoSum_BruteForce(int[] inpArray, int target) {
        for (int i = 0; i < inpArray.length - 1; i++) {
            for (int j = i + 1; j < inpArray.length; j++) {
                if (target == inpArray[i] + inpArray[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // Time complexity: O(n)
    public static int[] twoSum(int[] inpArray, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < inpArray.length; i++) {
            int diff = target - inpArray[i];
            if (hashMap.containsKey(diff)) {
                return new int[]{hashMap.get(diff), i};
            } else {
                hashMap.put(inpArray[i], i);
            }
        }
        return null;
    }
}
