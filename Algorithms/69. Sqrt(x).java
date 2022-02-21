// Source : https://leetcode.com/problems/sqrtx/
// Author : Shrey Shah
// Date   : 21/12/2021

/*
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.

 

Example 1:

Input: x = 4
Output: 2
Example 2:

Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
 

Constraints:

0 <= x <= 231 - 1
*/


class Solution {
    public int mySqrt(int x) {
        int square_root;
        square_root = (int) Math.sqrt(x);
        return square_root;
    }
}


/*
Success
Details 
Runtime: 2 ms, faster than 73.15% of Java online submissions for Sqrt(x).
Memory Usage: 41.2 MB, less than 24.97% of Java online submissions for Sqrt(x).
Time Submitted	22/02/2022 04:23
Status		Accepted
Runtime		2 ms
Memory		41.2 MB
Language		java
*/