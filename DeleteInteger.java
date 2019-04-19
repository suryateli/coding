import java.util.Scanner;

public class DeleteInteger {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter no. of elements in array:");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter the elements in array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter the element to be deleted: ");
    int value = sc.nextInt();

    // boolean isPresent = false; 
    // int index=0;
    int index=-1;
    for(int i=0; i<n; i++) {
      if (arr[i] == value) {
        // isPresent = true;
        index = i;
      }
    }

    if (index != -1) { 
      // delete element at index (i.e. shift elements)
      for(int i=index+1; i<n; i++)
        arr[i-1] = arr[i];
      // Print modified array
      System.out.println("Modified array: ");
      for (int i = 0; i < n-1; i++) 
        System.out.print(arr[i]+" ");
    }
    else System.out.println("Element not present in array.");
  }
}