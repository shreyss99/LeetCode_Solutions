// Source : https://leetcode.com/problems/keep-multiplying-found-values-by-two/
// Author : Shrey Shah
// Date   : 21/02/2022


/*
You are given an array of integers nums. You are also given an integer original which is the first number that needs to be searched for in nums.

You then do the following steps:

If original is found in nums, multiply it by two (i.e., set original = 2 * original).
Otherwise, stop the process.
Repeat this process with the new number as long as you keep finding the number.
Return the final value of original.

 

Example 1:

Input: nums = [5,3,6,1,12], original = 3
Output: 24
Explanation: 
- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
- 24 is not found in nums. Thus, 24 is returned.
Example 2:

Input: nums = [2,7,9], original = 4
Output: 4
Explanation:
- 4 is not found in nums. Thus, 4 is returned.
 

Constraints:

1 <= nums.length <= 1000
1 <= nums[i], original <= 1000
*/


import java.util.*;

class Solution {
    public int findFinalValue(int[] nums, int original) {
        
        LinkedHashSet<Integer> numbersHashSet = new LinkedHashSet<Integer>();
        
        for(int i : nums){
            numbersHashSet.add(i);
        }
        
        int value = original;
        while(numbersHashSet.contains(value)){
            value *= 2;
        }
        
        return value;
    }
}


/*
Runtime: 3 ms, faster than 67.82% of Java online submissions for Keep Multiplying Found Values by Two.
Memory Usage: 42.4 MB, less than 83.12% of Java online submissions for Keep Multiplying Found Values by Two.

Time Submitted	02/18/2022 03:58
Status		Accepted
Runtime		3ms
Memory		42.4 MB
Language		java
*/