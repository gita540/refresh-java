package random_problems;

import java.util.Scanner;

public class BinaryAddition {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter binary string -1");
    String bin1 = sc.nextLine();
    System.out.println("Enter binary string - 2");
    String bin2 = sc.nextLine();
    sc.close();
    BinaryAddition ba = new BinaryAddition();
    String res = ba.binaryAddition(bin1, bin2);
    System.out.println(res);
    System.out.println(ba.binary_addition_with_java_api(bin1, bin2));
  }

  public String binaryAddition(String bin1, String bin2) {
    StringBuilder sb = new StringBuilder();
    int i = bin1.length() - 1;
    int j = bin2.length() - 1;
    int carry = 0;
    while (i >= 0 || j >= 0) {
      int sum = carry;
      if (i >= 0) {
        sum += bin1.charAt(i) - '0';
      }
      if (j >= 0) {
        sum += bin2.charAt(j) - '0';

      }
      sb.append(sum % 2);
      carry = sum / 2;
      i--;
      j--;
    }
    if (carry != 0) {
      sb.append(carry);
    }
    return sb.reverse().toString();
  }

  public String binary_addition_with_java_api(String bin1, String bin2) {
    int b1 = Integer.parseInt(bin1, 2);
    int b2 = Integer.parseInt(bin2, 2);
    int sum = b1 + b2;
    return Integer.toBinaryString(sum);

  }
}
