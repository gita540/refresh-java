package random_problems;

import java.util.Arrays;
import java.util.Scanner;

/*You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
*/
public class PlusOne {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter input array length ");
    int n = sc.nextInt();
    int[] nums = new int[n];

    System.out.println("Enter array elements");
    for (int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    PlusOne obj = new PlusOne();
    int[] res = obj.plusOne(nums);
    System.out.println(Arrays.toString(res));

  }

  public int[] plusOne(int[] digits) {
    int idx = digits.length - 1;
    while (idx >= 0) {
      if (digits[idx] == 9) {
        digits[idx] = 0;
      } else {
        digits[idx] += 1;
        return digits;
      }
      idx--;
    }
    int[] result = new int[digits.length + 1];
    result[0] = 1;
    return result;
  }

}
