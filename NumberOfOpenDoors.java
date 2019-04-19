// Number Of Open Doors 
/**
Consider a long alley with a N number of doors on one side. All the doors are closed initially. You move to and fro in the alley changing the states of the doors as follows: you open a door that is already closed and you close a door that is already opened. You start at one end go on altering the state of the doors till you reach the other end and then you come back and start altering the states of the doors again.
In the first go, you alter the states of doors numbered 1, 2, 3, … , n.
In the second go, you alter the states of doors numbered 2, 4, 6 …
In the third go, you alter the states of doors numbered 3, 6, 9 …
You continue this till the Nth go in which you alter the state of the door numbered N.
You have to find the number of open doors at the end of the procedure.
Input: 
The first line of input contains a single integer T denoting the number of test cases. Then T test cases follow. Each test case consists of one line. The line consists of a positive integer N.
Output:
Corresponding to each test case, in a new line, print the number of doors that will be open at the end of the procedure mentioned above.
Constraints:
1 ≤ T ≤ 100
1 ≤ N ≤ 1012              

Example:
Input
5
372
2
100
825625
63542
Output
19
1
10
908
252
 */

/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int t = Integer.parseInt(br.readLine()); 
		while(t-- > 0) {
		    long n = Long.parseLong(br.readLine()); 
		  //  HashMap<Long, Boolean> hm = new HashMap<Long, Boolean>();
		  //  for(long i=1; i<=n; ++i)
		  //      hm.put(i, true); // for i=1, all doors are open
		        
		  //  for(long i=2; i<=n; ++i) {
		  //      long m=i; // m is multiple of i
		  //      while(m <= n) {
    // 		      //  if(i%m == 0) 
    // 		      hm.replace(i, !hm.get(i));
		  //        m += i;
		  //      }
		  //  }
		    
		  //  // count number of open doors at the end of the procedure
		  //  int count=0;
		  //  for(long i=1; i<=n; ++i) {
		  //      if(hm.get(i))
		  //          count++;
		  //  }
		    System.out.println((int)Math.sqrt(n));
		}
		
	}
}

/**
Solution:
A door is toggled in ith walk if i divides door number. For example the door number 45 is toggled in 
1st, 3rd, 5th, 9th and 15th walk.
The door is switched back to initial stage for every pair of divisors. 
For example 45 is toggled 6 times for 3 pairs (5, 9), (15, 3) and (1, 45).
It looks like all doors would become closes at the end. But there are door numbers which would become open, 
for example 16, the pair (4, 4) means only one walk. 
Similarly all other perfect squares like 4, 9,...
So the answer is 1, 4, 9, 16, 25, 36, 49, 64, 81 and 100. // total 10
 */