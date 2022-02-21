// Source : https://leetcode.com/problems/powx-n/
// Author : Shrey Shah
// Date   : 21/02/2022


/*
Implement pow(x, n), which calculates x raised to the power n (i.e., x^n).

 

Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000
Example 2:

Input: x = 2.10000, n = 3
Output: 9.26100
Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2^-2 = 1/2^2 = 1/4 = 0.25
 

Constraints:

-100.0 < x < 100.0
-231 <= n <= 231-1
-104 <= xn <= 104
*/


import java.util.*;

class Solution {
    public double myPow(double x, int n) {
        
	//Recursive function for power
	//Condition 1 is when power is 0
	//Condition 2 is when power is negative
	//Condition 3 is when power is even - we use the rule: x^n = (x^2)^(n/2)
	//Condition 4 is when power is odd - we use the rule: x^n = x*(x^2)^(n/2) 

       if(n==0){
            return(1); 
        }
        else if (n<0){
            n = n * -1;
            return(1/(x * myPow(x, n-1)));
        }
        else if (n%2 == 0){
            return myPow(x*x, n/2);
        }
        else{
            return x*myPow(x*x, n/2);
        }
    }
}


/*
Success
Details 
Runtime: 1 ms, faster than 74.27% of Java online submissions for Pow(x, n).
Memory Usage: 44.2 MB, less than 5.16% of Java online submissions for Pow(x, n).

Time Submitted	02/21/2022 05:26
Status		Accepted
Runtime		1 ms
Memory		44.2 MB
Language		java
*/