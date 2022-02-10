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
    return true;
  }

}
