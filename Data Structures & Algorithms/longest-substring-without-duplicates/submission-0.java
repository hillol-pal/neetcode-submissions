class Solution {
    public int lengthOfLongestSubstring(String s) {

        if(s.length() ==0 || s.length() == 1)
           return s.length();

        int maxLength = 0;
        int left=0;
        int right=0;
        Set<Character> uniqueCharsInWindow=new HashSet<>();
        
        while(right< s.length()){
           
           if(uniqueCharsInWindow.add(s.charAt(right))){
              
              right++;
              maxLength = Math.max(maxLength,uniqueCharsInWindow.size());

           }else{
              uniqueCharsInWindow.remove(s.charAt(left));
              left++;
           }
        }

        return maxLength;
    }
}
