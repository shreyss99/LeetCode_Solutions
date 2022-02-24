// Source : https://leetcode.com/problems/divide-two-integers/
// Author : Shrey Shah
// Date   : 25/02/2022


/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part. For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range: [−2^31, 2^31 − 1]. For this problem, if the quotient is strictly greater than 2^31 - 1, then return 2^31 - 1, and if the quotient is strictly less than -2^31, then return -2^31.

 

Example 1:

Input: dividend = 10, divisor = 3
Output: 3
Explanation: 10/3 = 3.33333.. which is truncated to 3.
Example 2:

Input: dividend = 7, divisor = -3
Output: -2
Explanation: 7/-3 = -2.33333.. which is truncated to -2.
 

Constraints:

-2^31 <= dividend, divisor <= 2^31 - 1
divisor != 0
*/


class Solution {
    public int divide(int dividend, int divisor) {
     
        long quotient = 0;
        long new_divisor, new_dividend;
        
        //If divisor and dividend are negative we are storing them into positive values
        new_divisor = (divisor < 0) ? (long) divisor*-1 : (long) divisor;
        new_dividend = (dividend < 0) ? (long) dividend*-1 : (long) dividend;

        //Bitwise manipulation operation for division
        /*
            Since we have int numbers we run a loop from MSB to LSB (31 to 0).
            We left shift the divisor by 'i' units and check if it is less than or equal to dividend
            If yes, then we subtract divisor from dividend and add 2^i to the quotient
            If no, next iteration
            
            Since this approach uses left shift operator and binary values it is suitable for numbers in powers of 2. In other cases the quotient will be only the integer solution and fractional part will be eliminated.     
        */
        
        //https://iq.opengenus.org/bitwise-division/
        
        long temp;
        for(long i=31; i>=0; i--){
            temp = new_divisor << i;
            if(temp <= new_dividend){
                new_dividend -= temp;
                quotient += (long) 1 << i;
            }
        }
        
        
        //Boundary Case when the quotient is > 2^31 and both dividend and divisor are negative, so return 2^31-1
        if(quotient > Integer.MAX_VALUE && divisor < 0 && dividend < 0)
            return Integer.MAX_VALUE;
        
        //Boundary Case when the quotient is > 2^31 and dividend is negative and and divisor is positive, so return -2^31 (because dividend cannot be 2^31 as int does not allow it so it has to be negative)
        else if(quotient > Integer.MAX_VALUE && divisor > 0 && dividend < 0)
            return Integer.MIN_VALUE;
        
        //Boundary Case when the quotient is < -2^31, so we return -2^31
        else if(quotient < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        //Boundary Case when the quotient is > 2^31, so we return 2^31-1
        else if(quotient > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        //When both dividend and divisor are negatibe or positive, so quotient is positve
        else if(dividend < 0 && divisor < 0 || dividend > 0 && divisor > 0)
            return (int) quotient;
        
        //When either dividend or divisor is negatibe=, so quotient is negative
        else
            return (int) quotient*-1;
    }
}


/*
Success
Details 
Runtime: 2 ms, faster than 70.75% of Java online submissions for Divide Two Integers.
Memory Usage: 41.4 MB, less than 22.57% of Java online submissions for Divide Two Integers.

Time Submitted	25/02/2022 04:50	
Status		Accepted
Runtime		2 ms
Memory		41.4 MB
Language		java
*/