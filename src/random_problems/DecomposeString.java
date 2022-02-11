package random_problems;

import java.util.Scanner;

public class DecomposeString {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string");
    String str = sc.nextLine();
    DecomposeString obj = new DecomposeString();
    System.out.println(obj.decomposeString(str));
    sc.close();
  }

  private boolean decomposeString(String str) {
    if (str.length() == 2 || str.charAt(0) != str.charAt(1)) {
      return false;
    }
    int twoCount = 0;
    for (int i = 1, count = 1; i <= str.length(); i++) {
      if (i == str.length() || str.charAt(i - 1) != str.charAt(i)) {
        if ((count %= 3) == 1) {
          return false;
        }
        twoCount += count == 2 ? 1 : 0;
        count = 1;
      } else {
        count++;
      }
    }
    return twoCount == 1;

  }

}
