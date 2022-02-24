class Solution {
    public int myAtoi(String s) {
        
        //trim the string for leading and trailing white spaces
        s = s.trim();
        
        if (s.length()==0)
            return 0;
        
        String stringNumber = "";
        String sign = "";
        Long finalNumber;
        
        for(int i=0;i<s.length();i++){
            if (s.charAt(i) == '+' || s.charAt(i) == '-')
                sign = Character.toString(s.charAt(i));
            
            else if(Character.isDigit(s.charAt(i)) && s.charAt(i) != '0')
                stringNumber += Character.toString(s.charAt(i));
            
            else if((Character.isLetter(s.charAt(i)) || s.charAt(i) == '.' || s.charAt(i) == ' ' || s.charAt(i) == '+' || s.charAt(i) == '-') && stringNumber.length() == 0){
                stringNumber = "0";
                break;
            }
            
            else if((Character.isLetter(s.charAt(i)) || s.charAt(i) == '.' || s.charAt(i) == ' ' || s.charAt(i) == '+' || s.charAt(i) == '-') && stringNumber.length() != 0)
                break;
            }
        
        
        if(sign != "")
            finalNumber = Long.parseLong(sign+stringNumber);
        else
            finalNumber = Long.parseLong(stringNumber);
        
        if(finalNumber > Integer.MAX_VALUE - 1)
            return Integer.MAX_VALUE;
        else if(finalNumber < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        else
            return finalNumber.intValue();
    }
}