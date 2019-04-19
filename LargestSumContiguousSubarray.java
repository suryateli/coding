// Java program to print largest contiguous array sum
// Write an efficient program to find the sum of contiguous subarray within a one-dimensional array of numbers which has the largest sum 
// To print the subarray with the maximum sum, we maintain indices whenever we get the maximum sum.
import java.util.Scanner;
import java.lang.Math;

public class LargestSumContiguousSubarray {

  // public static int maxSum(int arr[], int n) {
  //   int max_ending_here = 0; 
  //   int max_so_far = 0;

  //   for (int i = 0; i < n; i++) {
  //     max_ending_here += arr[i];

  //     if (max_ending_here < 0) 
  //       max_ending_here = 0;
  //     else if (max_ending_here > max_so_far)
  //       max_so_far = max_ending_here;
  //   }

  //   return max_so_far;   
  // }

  public static int maxSum(int[] arr, int n) {
    int maxEndingHere = 0;
    int maxSoFar = 0;
    int start=0, end=0, s=0;

    for(int i=0; i<n; i++) {
      maxEndingHere += arr[i];

      if(maxSoFar < maxEndingHere) {
        maxSoFar = maxEndingHere;
        start = s;
        end = i;
      }

      if(maxEndingHere < 0) {
        maxEndingHere = 0;
        s = s+1;
      }
    }
    System.out.println(start+"<- Start index");
    System.out.println(end+"<- End index");
    System.out.println((end-start + 1)+"<- Length");
    return maxSoFar;
  }

  public static int maxSumNeg(int[] arr, int n) {
    int currMax = arr[0];
    int maxSoFar = arr[0];
    for(int i=1; i<n; ++i) {
      currMax = Math.max(arr[i], currMax + arr[i]); // max between current element and current max + element
      maxSoFar = Math.max(maxSoFar, currMax);
    }
    return maxSoFar;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(maxSum(arr, n));
    System.out.println(maxSumNeg(arr, n));
  }
}

// -2, -3, 4, -1, -2, 1, 5, -3