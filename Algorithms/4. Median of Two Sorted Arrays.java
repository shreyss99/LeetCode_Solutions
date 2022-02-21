// Source : https://leetcode.com/problems/median-of-two-sorted-arrays/
// Author : Shrey Shah
// Date   : 21/02/2022


/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).

 

Example 1:

Input: nums1 = [1,3], nums2 = [2]
Output: 2.00000
Explanation: merged array = [1,2,3] and median is 2.
Example 2:

Input: nums1 = [1,2], nums2 = [3,4]
Output: 2.50000
Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 

Constraints:

nums1.length == m
nums2.length == n
0 <= m <= 1000
0 <= n <= 1000
1 <= m + n <= 2000
-10^6 <= nums1[i], nums2[i] <= 10^6
*/


import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
        double a, b;

	//We will convert int[] to Integer[] so that they can be used for easy sort operations
        Integer[] nums1Integer = new Integer[nums1.length]; 
        Integer[] nums2Integer = new Integer[nums2.length]; 
        
        Arrays.setAll(nums1Integer, i -> nums1[i]);
        Arrays.setAll(nums2Integer, i -> nums2[i]);
            
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>(Arrays.asList(nums1Integer));
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>(Arrays.asList(nums2Integer));
        
	//copy elements from 2nd arraylist and mergine them at the end of first arraylist
	//and then sorting the complete arraylist to get median
        arrayList1.addAll(arrayList2);
        Collections.sort(arrayList1);
        
	//if there are odd-numbered elements in arraylist return the middle element
        if(arrayList1.size() % 2 != 0){
            a = arrayList1.get((arrayList1.size() - 1)/2);
            return a;
        }
	//if there are even-numbered elements in arraylist take average of middle 2 elements
        else{
            a = arrayList1.get((arrayList1.size())/2 - 1);
            b = arrayList1.get((arrayList1.size())/2);
            return (a+b)/2;
        }
    }
}


/*
Success
Details 
Runtime: 16 ms, faster than 11.13% of Java online submissions for Median of Two Sorted Arrays.
Memory Usage: 53.2 MB, less than 5.33% of Java online submissions for Median of Two Sorted Arrays.
Time Submitted	02/21/2022 05:00
Status		Accepted
Runtime		16 ms
Memory		53.2 MB
Language		java
*/