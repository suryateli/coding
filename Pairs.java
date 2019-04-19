// Determine the number of pairs of array elements that have a difference equal to a target value.

// For example, given an array of [1, 2, 3, 4] and a target value of 1, 
// we have three values meeting the condition: 2-1=1, 3-2=1, and 4-3=1.
// each integer  will be unique

// pairs has the following parameter(s):

// k: an integer, the target difference
// arr: an array of integers

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Pairs {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
      /* sort the array first, then keep a pointer at the lowest integer and another at the highest
       if their difference is higher than the target difference, 
       then shift the high pointer lower, 
       else if their difference is lower than the target, 
       then shift the low pointer higher */
       int low=0, high = arr.length -1;
       int count = 0; // to keep count of the number of element pairs having the required difference
       int difference=0;
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
      
       while (low<high) {
         difference = arr[high] - arr[low];
         if(difference == k) {
            // System.out.println(arr[high]+","+arr[low]);
            ++count;
         }
       }
       return count;
    }

    public static void main(String[] args) throws IOException {

        // int[] arr = new int[]{1,2,3,4};
        int[] arr = new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        int k=1;
        int result = pairs(k, arr);
        System.out.println(result);

    }
}
