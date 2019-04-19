import java.util.Scanner;

public class findGCD {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();    
    int n2 = sc.nextInt();    
    int a = n1, b = n2;

    while (a != b) {
      if(a>b)
        a -= b;
      else b -= a;
    }
    
    int gcd = a;
    int lcm = n1*n2/gcd;

    System.out.println("GCD = "+gcd);
    System.out.println("LCM = "+lcm);
  }
}