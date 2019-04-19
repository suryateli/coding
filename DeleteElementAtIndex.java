// Delete an element from an array if index is provided
// Eg. {5,7,9,4,6,2} index=3 the output should be {5,7,9,6,2}

import java.util.Scanner;

public class DeleteElementAtIndex {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter no. of elements in array: ");
    int n = sc.nextInt();

    int[] arr = new int[n];
    System.out.println("Enter elements in array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter index of element to be deleted: ");
    int index = sc.nextInt();

    for(int i=index+1; i<n; i++)
      arr[i-1] = arr[i];

    System.out.println("Modified array: ");  
    for (int i = 0; i < n-1; i++) {
      System.out.print(arr[i]+" ");
    }  
  }
}