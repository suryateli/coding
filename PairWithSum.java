// Find a pair from a collection of numbers, whose addition is equal to the  target sum
// Sample testcase: 
// 1. collection=[1,2,3,9] , sum=8, o/p=no
// 1. collection=[1,2,4,4] , sum=8, o/p=yes

// the no.s in the collection are sorted

// Count no. of pairs with sum=k
// Print
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap;

public class PairWithSum {
  // print pairs
  public static int printPairs(int[] arr, int sum) {
    Arrays.sort(arr);
    System.out.println(arr.toString());
    int low=0, high=arr.length-1, count=0;

    while (low<high) {
      if(arr[low]+arr[high] == sum) {
        System.out.println(arr[low]+", "+arr[high]);
        count++;
      }
      if(arr[low]+arr[high] > sum)
        high--;
      else low++;
    }
    return count;
  }

  // 11 13
  // 10 12 10 15 -1 7 6 5 4 2 1 1 1

	// Returns number of pairs in arr[0..n-1] with sum equal 
	// to 'sum' 
	static int getPairsCount(int[] arr, int sum) 
	{ 
		HashMap<Integer, Integer> hm = new HashMap<>(); 
    int n=arr.length;
		// Store counts of all elements in map hm 
		for (int i=0; i<n; i++){ 
			
			// initializing value to 0, if key not found 
			if(!hm.containsKey(arr[i])) 
				hm.put(arr[i],0); 
				
			hm.put(arr[i], hm.get(arr[i])+1); 
		} 
		int twice_count = 0; 

		// iterate through each element and increment the 
		// count (Notice that every pair is counted twice) 
		for (int i=0; i<n; i++) 
		{ 
			if(hm.get(sum-arr[i]) != null) 
				twice_count += hm.get(sum-arr[i]); 

			// if (arr[i], arr[i]) pair satisfies the condition, 
			// then we need to ensure that the count is 
			// decreased by one such that the (arr[i], arr[i]) 
			// pair is not considered 
			if (sum-arr[i] == arr[i]) 
				twice_count--; 
		} 

		// return the half of twice_count 
		return twice_count/2; 
	} 


  public static int countPairs(int[] arr, int sum) {
    HashSet<Integer> comp = new HashSet<Integer>();
    int count=0;
    for (int val : arr) {
      if(comp.contains(sum-val)) {
        System.out.println((sum-val)+", "+val);
        count++;
      }
      else comp.add(val);
    }
    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // input: 
    // n
    // sum
    // arr
    int sum = sc.nextInt();
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    
    System.out.println("hashmap method");
    System.out.println("Store counts of all elements in map hm ");
    System.out.println("Iterate through each element and ");
    System.out.println("\t If comp is present in hm, then add count of comp to twice_count ");
    System.out.println("\t If comp == element, --twice_count ");
    System.out.println("Count = "+getPairsCount(arr,sum));
    System.out.println("--------------------------");
    System.out.println("Store complement in HashSet method");
    System.out.println("Count = "+countPairs(arr,sum));
    System.out.println("--------------------------");
    System.out.println("Sort, high, low method");
    System.out.println("Count = "+printPairs(arr,sum));
  }
}