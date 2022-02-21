// Source : https://leetcode.com/problems/two-sum/
// Author : Shrey Shah
// Date   : 21/12/2021

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {

	//create an int[] for storing result of 2 indices
      int result[] = new int[2];

	//iterate i from 0-th index to array length
      for (int i=0;i<nums.length;i++)
      {
	    //iterate j from i+1-th index to array length
	    //idea is to start with 0 (outer loop) and check if sum is equal to target with 1..to array length (inner loop)
          for (int j=i+1;j<nums.length;j++)
          {
		  //if sum of the numbers at i and j indices is equal to target store the indices in result array
              if ((nums[i] + nums[j]) == target)
              {
                  result[0] = j;
                  result[1] = i;
                  return result;
              }
          }
      }
      return result;
    }
}



