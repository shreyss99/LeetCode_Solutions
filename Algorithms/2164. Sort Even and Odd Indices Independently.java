// Source : https://leetcode.com/problems/sort-even-and-odd-indices-independently/
// Author : Shrey Shah
// Date   : 18/02/2022


/*
You are given a 0-indexed integer array nums. Rearrange the values of nums according to the following rules:

Sort the values at odd indices of nums in non-increasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [4,3,2,1] after. The values at odd indices 1 and 3 are sorted in non-increasing order.
Sort the values at even indices of nums in non-decreasing order.
For example, if nums = [4,1,2,3] before this step, it becomes [2,1,4,3] after. The values at even indices 0 and 2 are sorted in non-decreasing order.
Return the array formed after rearranging the values of nums.


Example 1:

Input: nums = [4,1,2,3]
Output: [2,3,4,1]
Explanation: 
First, we sort the values present at odd indices (1 and 3) in non-increasing order.
So, nums changes from [4,1,2,3] to [4,3,2,1].
Next, we sort the values present at even indices (0 and 2) in non-decreasing order.
So, nums changes from [4,1,2,3] to [2,3,4,1].
Thus, the array formed after rearranging the values is [2,3,4,1].
Example 2:

Input: nums = [2,1]
Output: [2,1]
Explanation: 
Since there is exactly one odd index and one even index, no rearrangement of values takes place.
The resultant array formed is [2,1], which is the same as the initial array. 
 

Constraints:

1 <= nums.length <= 100
1 <= nums[i] <= 100
*/


import java.util.*;

class Solution {
    public int[] sortEvenOdd(int[] nums) {
     
	//Creating 2 arraylists for storing odd and even numbers	
        List<Integer> odd_numbers = new ArrayList<Integer>((nums.length+1)/2);
        List<Integer> even_numbers = new ArrayList<Integer>((nums.length+1)/2);
        
	//Check if number is odd or even and store in respective arraylist
        for(int i=0;i<nums.length;i++){
            if (i%2 == 0)
                even_numbers.add(nums[i]);
            else
                odd_numbers.add(nums[i]);
        }
        
	//Sort the even numbers arraylist in ascending order
	//Sort the odd numbers arraylist in descending order
        Collections.sort(even_numbers);
        Collections.sort(odd_numbers, Collections.reverseOrder());
            
        int j=0;
        int k=0;

	//Using j as even number array counter, store even numbers at even indices of original array 
	//Using k as odd number array counter, store odd numbers at odd indices of original array
        for(int i=0;i<nums.length;i++){
            if (i%2 == 0){
                nums[i] = even_numbers.get(j);
                j++;
            } 
            else{
                nums[i] = odd_numbers.get(k);
                k++;
            }
               
        }
        return nums;
    }
}


