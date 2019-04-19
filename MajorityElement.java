/**
Majority Element
Write a function which takes an array and prints the majority element (if it exists), 
otherwise prints “No Majority Element”. A majority element in an array A[] of size n is an 
element that appears more than n/2 times (and hence there is at most one such element).

Input : {3, 3, 4, 2, 4, 4, 2, 4, 4}
Output : 4 

Input : {3, 3, 4, 2, 4, 4, 2, 4}
Output : No Majority Element
 */

 /*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while(t-- > 0) {
		    int n = Integer.parseInt(br.readLine());
		    int[] arr = new int[n];
		    String[] nums = br.readLine().trim().split("\\s+");
		    for(int i=0; i<n; ++i)
		        arr[i] = Integer.parseInt(nums[i]);
		        
		    majorityEle(arr, n);
		    
		}
	}
	
	public static void majorityEle(int[] arr, int n) {
		 HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(n);
		    // maintain frequency of each element
		    for(int i=0; i<n; ++i) {
		        if(map.containsKey(arr[i])) {
		            int count = map.get(arr[i]) +1;
		            if(count > n/2) {
		                System.out.println(arr[i]);
		                return;
		            }
		            else map.replace(arr[i],count);
		        }
		        else map.put(arr[i],1);
		    }
		    System.out.println(-1);
	}
}