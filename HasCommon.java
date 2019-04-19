public class HasCommon {
  public static void main(String[] args) {
    char[] arr1 = {'a', 'b', 'c', 'x'};
    char[] arr2 = {'z', 'y', 'i'};

    char[] arr3 = {'z', 'y', 'x'}; 
    System.out.println(hasCommon(arr1, arr2)); 
    System.out.println(hasCommon(arr1, arr3)); 
  }

  public static boolean hasCommon(char[] arr1, char[] arr2) {
    boolean common = false;
    for (char letter1 : arr1) {
      for (char letter2 : arr2) {
        if (letter1 == letter2)
          common = true;
      }
    }
    return common;
  }
}