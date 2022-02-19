// Source : https://leetcode.com/problems/valid-palindrome/
// Author : Shrey Shah
// Date   : 19/02/2022


/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
 

Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
*/


import java.util.*;
import java.io.*;

class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");

        StringBuilder string = new StringBuilder();
        string.append(s);

        if((string.toString()).equals((string.reverse()).toString()))
            return true;
        else
            return false;
    }
}


/*
Success
Details 
Runtime: 24 ms, faster than 33.69% of Java online submissions for Valid Palindrome.
Memory Usage: 48 MB, less than 10.94% of Java online submissions for Valid Palindrome.

Time Submitted	02/19/2022 15:04
Status		Accepted
Runtime		24ms
Memory		48 MB
Language		java
*/