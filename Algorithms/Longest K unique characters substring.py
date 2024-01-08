/*

Longest K unique characters substring:

Given a string you need to print the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.

Example 1:

Input:
S = "aabacbebebe", K = 3
Output: 
7
Explanation: 
"cbebebe" is the longest substring with 3 distinct characters.
Example 2:

Input: 
S = "aaaa", K = 2
Output: -1
Explanation: 
There's no substring with 2 distinct characters.
Your Task:
You don't need to read input or print anything. Your task is to complete the function longestKSubstr() which takes the string S and an integer K as input and returns the length of the longest substring with exactly K distinct characters. If there is no substring with exactly K distinct characters then return -1.

Expected Time Complexity: O(|S|).
Expected Auxiliary Space: O(|S|).

Constraints:
1 ≤ |S| ≤ 105
1 ≤ K ≤ 26
All characters are lowercase latin characters.

*/

class Solution:

    def longestKSubstr(self, s, k):

        i, j, max_length = 0, 0, -1
        hash_map = {}
        
        while j < len(s):
            hash_map[s[j]] = hash_map.get(s[j], 0) + 1
                
            if len(hash_map) == k:
                max_length = max(max_length, sum(hash_map.values()))
            
            while len(hash_map) > k:
                hash_map[s[i]] -= 1
                if hash_map[s[i]] == 0:
                    del hash_map[s[i]]
                i += 1
            j += 1
    
        return max_length