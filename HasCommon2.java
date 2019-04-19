import java.util.*;

public class HasCommon2 {
  public static void main(String[] args) { 

    HashMap<Character, Boolean> alphabets = new HashMap<Character, Boolean>();
    for(char ch='a'; ch <='z'; ++ch)
      alphabets.put(ch, false);

    // System.out.println(alphabets);
    // System.out.println("----------------");

    char[] arr1 = {'a', 'b', 'c', 'x'};
    char[] arr2 = {'z', 'y', 'i'};
    char[] arr3 = {'z', 'y', 'x'};

    System.out.println(hasCommon(arr1, arr2, alphabets)); 
    System.out.println(hasCommon(arr1, arr3, alphabets));
  }

  public static boolean hasCommon(char[] arr1, char[] arr2, HashMap<Character, Boolean> alphabets) {
    boolean common = false;

    // set values of letters1 present in hashmap to true
    for (char letter1 : arr1) {
      alphabets.replace(letter1, true);
    }
    // System.out.println(alphabets);

    for (char letter2 : arr2) {
      if(alphabets.get(letter2) == true)
        common = true;
    }

    // System.out.println("----------------");
    return common;
  }
}

// O(a+b)