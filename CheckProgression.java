import java.util.Scanner;

public class CheckProgression {
  public static boolean isAP(int arr[], int n) {
    if (n==1) return true;
    int d = arr[1] - arr[0]; // common difference
    for (int i = 2; i < n; i++) {
      if ((arr[i] - arr[i-1]) != d) 
        return false;
    }
    return true;
  }

  public static boolean isGP(int arr[], int n) {
    if (n==1) return true;
    int r = arr[1]/arr[0];
    for (int i = 2; i < n; i++) {
      if (arr[i]/arr[i-1] != r) 
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no. of elements in array: ");
    int n = sc.nextInt();

    System.out.println("Enter the numbers in the sequence: ");
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    if (isAP(arr, n)) System.out.println("Sequence is in AP");
    else if(isGP(arr, n)) System.out.println("Sequence is in GP");
    else System.out.println("Sequence is neither in AP nor GP");
  }
}