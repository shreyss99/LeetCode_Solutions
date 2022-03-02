// Source : https://leetcode.com/problems/goal-parser-interpretation/
// Author : Shrey Shah
// Date   : 02/03/2022


/*
You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.

Given the string command, return the Goal Parser's interpretation of command.

 

Example 1:

Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
Example 2:

Input: command = "G()()()()(al)"
Output: "Gooooal"
Example 3:

Input: command = "(al)G(al)()()G"
Output: "alGalooG"
 

Constraints:

1 <= command.length <= 100
command consists of "G", "()", and/or "(al)" in some order.
*/


class Solution {
    public String interpret(String command) {
        
        /*StringBuilder goalInterpretation = new StringBuilder();
        
        int i=0;
        while(i < command.length()){
            
            if(command.charAt(i) == 'G'){
                goalInterpretation.append("G");
                i++;
            }
            
            else if(command.charAt(i) == '('){
                if (command.charAt(i+1) == ')'){
                    goalInterpretation.append("o");
                    i+=2;
                }
                else{
                    goalInterpretation.append("al");
                    i+=4;
                } 
            }
        }
        
        return goalInterpretation.toString();*/
        
        return command.replace("()","o").replace("(al)","al");
    }
}


/*
Success
Details 
Runtime: 2 ms, faster than 33.69% of Java online submissions for Goal Parser Interpretation.
Memory Usage: 40.4 MB, less than 50.28% of Java online submissions for Goal Parser Interpretation.

Time Submitted	02/03/2022 06:13
Status		Accepted
Runtime		2 ms
Memory		40.4 MB
Language		java
*/