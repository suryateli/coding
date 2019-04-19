import java.util.*;

public class HasCommon3 {
  public static void main(String[] args) {
    
    // can we assume all the elements in the array are characters
    char[] arr1 = {'a', 3, 'c', 'x'};
    char[] arr2 = {'1', 'y', 'i'};
    char[] arr3 = {2, 'y', 798, 'c'};
    
    // can we assume there are two inputs and both are arrays
    System.out.println(hasCommon(arr1, arr2)); 
    System.out.println(hasCommon(arr1, arr3));
  }
  
  public static boolean hasCommon(char[] arr1, char[] arr2) {
    // can consist of more functions
    boolean common = false;
    HashSet<Character> set1 = new HashSet<Character>();

    // put values of arr1 in hashset 
    for (char letter1 : arr1) { // O(a)
      set1.add(letter1); // O(1)
    }
    // System.out.println(set1);

    // check if the value in arr2 is present in the hashset
    for (char letter2 : arr2) { // O(b)
      if(set1.contains(letter2)) { // O(1)
        common = true;
        System.out.println(letter2);
      }
    }

    return common;
  }
}

// Time complexity - O(a+b)
// Space complexity - O(a)