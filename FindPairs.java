// Find a pair from a collection of numbers, whose addition is equal to the  target sum
// Sample testcase: 
// 1. collection=[1,2,3,9] , sum=8, o/p=no
// 1. collection=[1,2,4,4] , sum=8, o/p=yes

public class FindPairs {
  public static void main(String[] args) {
    // System.out.println("Enter the elements in the array: ");
    int[] arr = {1,2,3,9};
    System.out.println(findPairs(arr, 8));
    System.out.println("----------------");
    int[] arr2 = {1,2,4,4};
    System.out.println(findPairs(arr2, 8));
  }

  public static boolean findPairs(int[] array, int targetSum) {
    boolean isPairPresent=false;
    for (int i = 0; i < array.length; ++i) {
      for (int j = array.length-1; j >= 0; --j) {
        if(i != j)
          if(array[i] + array[j] == targetSum) {
            System.out.println(array[i] +","+ array[j] );
            isPairPresent = true;
          }
      }
    }
    System.out.println("=========");
    return isPairPresent;
  }
}