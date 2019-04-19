// Write a program to implement the pattern given based on user input for number of rows
//     eg if rows=4
//         aaabaaa
//         aabbbaa
//         abbbbba
//         bbbbbbb

import java.util.Scanner;
public class PrintPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int b = 1;
    for (int i = n; i >= 1; i--) {
      for(int j = i-1; j>=1; j--)
        System.out.print("a");
      for(int k = 1; k<=b; k++)
        System.out.print("b");
      b+=2;
      for(int j = i-1; j>=1; j--)
        System.out.print("a");
      System.out.println();
    }
  }
}