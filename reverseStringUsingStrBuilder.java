import java.util.Scanner;

public class reverseStringUsingStrBuilder {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();

    StringBuilder sb = new StringBuilder(str);
    System.out.println(sb.reverse());
  }
}