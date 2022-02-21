// Source : https://leetcode.com/problems/palindrome-number/
// Author : Shrey Shah
// Date   : 21/12/2021


/*
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward.

For example, 121 is a palindrome while 123 is not.
 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-2^31 <= x <= 2^31 - 1
*/


class Solution {

    public boolean isPalindrome(int x) {
        int original = x;
        int reversed = 0;
        int remainder;

	//We extract the units digit number and then divide the number by 10 and try constructing the reverse number
	//repeat till the number is greater than 0
        while (x > 0)
        {
            remainder = x%10;
            x = x/10;
            reversed = 10*reversed + remainder;
        }
	
	//check if the original number is equal to the reversed or original is negative number
        if(reversed != original || original < 0)
            return false;
        else
            return true;
    }
}