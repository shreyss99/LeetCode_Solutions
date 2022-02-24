// Source : https://leetcode.com/problems/reverse-integer/
// Author : Shrey Shah
// Date   : 24/02/2022


/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

Example 1:

Input: x = 123
Output: 321
Example 2:

Input: x = -123
Output: -321
Example 3:

Input: x = 120
Output: 21
 

Constraints:

-2^31 <= x <= 2^31 - 1
*/


class Solution {
    public int reverse(int x) {
        
        long reversed = 0;
        long remainder;
        int isNegative = 0;
        
	//check if number is negative and convert it to positive for calculation
        if (x < 0){
            isNegative = 1;
            x *= -1;
        }
        
	//Iterate till number > 0 and extract the units digit
	//Divide the original number and add the remainder to the reversed number obtained so far
        while(x > 0){    
            remainder = x%10;
            x /= 10;
            reversed = 10*reversed + remainder;
        }
        
	//Handling edge case when the reversal of number causes it to go beyond the signed int limit.
        if(reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE)
            return 0;
        else if(isNegative == 1)
            return (int) reversed * -1;
        else
            return (int) reversed;
    }
}


/*
Success
Details 
Runtime: 1 ms, faster than 99.34% of Java online submissions for Reverse Integer.
Memory Usage: 41.3 MB, less than 27.04% of Java online submissions for Reverse Integer.

Time Submitted	02/24/2022 21:17	
Status		Accepted
Runtime		1 ms
Memory		41.3 MB
Language		java
*/