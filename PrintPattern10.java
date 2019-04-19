// Write a program to implement the pattern given based on user input for number of rows
        //  1
        //  10
        //  101
        //  1010
        //  10101

import java.util.Scanner;
public class PrintPattern10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j%2);
      }
      System.out.println();
    }
  }
}