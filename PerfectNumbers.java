/**
Given a number N, check if a number is perfect or not. A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.
Input:
First line consists of T test cases. Then T test cases follow .Each test case consists of a number N.
Output:
For each testcase, in a new line, output in a single line 1 if a number is a perfect number else print 0.
Constraints:
1 <= T <= 300
1 <= N <= 1018
Example:
Input:
2
6
21
Output:
1
0
 */

/*package whatever //do not write package name here */

// import java.util.*;
// import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long sumOfFactors;
		
		while(t-->0) {
		    long n = Long.parseLong(br.readLine());
		    sumOfFactors=1; // since 1 is a factor and is not included in the loop
		    for(int i=2; i<Math.sqrt(n); ++i) {
		        if(n%i == 0) {
		            if(i != n/i)
		                sumOfFactors += i + n/i;
		            else sumOfFactors += i;
		        }
		    }
		    if(sumOfFactors == n) // since 1 is a factor and was not included in the loop
		        System.out.println(1);
		    else System.out.println(0);
		}
	}
}