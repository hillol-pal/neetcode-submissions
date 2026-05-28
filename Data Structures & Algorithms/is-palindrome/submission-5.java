class Solution {
    public boolean isPalindrome(String s) {

        if(s.length() == 1)
           return true;

        int left=0;
        int right=s.length() - 1;

        char[] literals = s.toCharArray();

        while(left<right){
           while(left<right && !Character.isLetterOrDigit(literals[left]))
             left++;

            while(left<right &&  !Character.isLetterOrDigit(literals[right]))
             right--;

            if(left<right && Character.toLowerCase(literals[left]) != Character.toLowerCase(literals[right]))
               return false;

            left++;
            right--;

        }

        return true;
        
    }
}
