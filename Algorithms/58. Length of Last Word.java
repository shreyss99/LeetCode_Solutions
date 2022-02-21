// Source : https://leetcode.com/problems/length-of-last-word/
// Author : Shrey Shah
// Date   : 13/02/2022


/*
Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.

A word is a maximal substring consisting of non-space characters only.

 

Example 1:

Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:

Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:

Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
 

Constraints:

1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
*/


class Solution {
    public int lengthOfLastWord(String s) {
        
	//We trim the original string to remove leading and trailing spaces
        s=s.trim();

	//We now split the trimmed string using " " as delimiter ad store words in array
        String[] split_arr = s.split(" ");
	//Finally, we can again trim the last word of spaces and calculate its length
        String last_word = split_arr[split_arr.length-1].trim();
        
        return last_word.length();
    }
}


/*
Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Length of Last Word.
Memory Usage: 40.8 MB, less than 33.52% of Java online submissions for Length of Last Word.
Time Submitted	02/22/2022 04:14
Status		Accepted
Runtime		0 ms
Memory		40.8 MB
Language		java
*/