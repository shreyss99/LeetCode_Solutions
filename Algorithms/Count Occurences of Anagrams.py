/*

Count Occurences of Anagrams:

Given a word pat and a text txt. Return the count of the occurrences of anagrams of the word in the text.

Example 1:

Input:
txt = forxxorfxdofr
pat = for
Output: 3
Explanation: for, orf and ofr appears
in the txt, hence answer is 3.
Example 2:

Input:
txt = aabaabaa
pat = aaba
Output: 4
Explanation: aaba is present 4 times
in txt.
Your Task:
Complete the function search() which takes two strings pat, txt, as input parameters and returns an integer denoting the answer. 
You don't need to print answer or take inputs.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(26) or O(256)

Constraints:
1 <= |pat| <= |txt| <= 105
Both strings contain lowercase English letters.

*/


class Solution:

	
	def search(self,pat, txt):
	    
	    i, j, result = 0, 0, 0
    
        pat_hash_map = {}
        for p in pat:
            pat_hash_map[p] = pat_hash_map.get(p, 0) + 1
        pat_count = len(list(pat_hash_map.keys()))
        
        while(j < len(txt)):
            # calculation
            if txt[j] in pat_hash_map:
                pat_hash_map[txt[j]] -= 1
                if pat_hash_map.get(txt[j]) == 0:
                    pat_count -= 1
                
            # increment j until we hit size
            if (j - i + 1) < len(pat):
                j += 1
                
            elif (j - i + 1) == len(pat):
                if pat_count == 0:
                    result += 1
                if txt[i] in pat_hash_map.keys():
                    pat_hash_map[txt[i]] += 1
                    if pat_hash_map.get(txt[i]) == 1:
                        pat_count += 1
    
                i += 1
                j += 1
                
        return result



