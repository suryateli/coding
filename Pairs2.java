// Determine the number of pairs of array elements that have a difference equal to a target value.

// For example, given an array of [1, 2, 3, 4] and a target value of 1, 
// we have three values meeting the condition: 2-1=1, 3-2=1, and 4-3=1.
// each integer  will be unique

// pairs has the following parameter(s):

// k: an integer, the target difference
// arr: an array of integers

// import java.io.*;
// import java.util.Arrays;
// import java.util.Scanner;
import java.util.*;

public class Pairs2 {

    // Complete the pairs function below.
    static int pairs(int k, int[] arr) {
       int count = 0; // to keep count of the number of element pairs having the required difference
      //  int difference=0;

      HashSet<Integer> comp = new HashSet<Integer>();

      for(int value: arr) {
        // if(comp.contains(value+k) || comp.contains(value-k) ) 
        if(comp.contains(value+k)) ++count;
        // if(comp.contains( Math.abs(value-k) )) ++count;
        if(comp.contains(value-k)) ++count;
        comp.add(value);
      }
      return count;
    }

    public static void main(String[] args) throws Exception {

        int[] arr = new int[]{1,2,3,4};
        // int[] arr = new int[]{1,5,3,4,2};
        int k=2;
        int result = pairs(k, arr);
        System.out.println(result);

    }
}
