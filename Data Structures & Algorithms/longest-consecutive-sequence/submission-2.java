class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums==null || nums.length==0)
           return 0;
        if(nums.length == 1)
           return 1;

        int longestConsecutive=1;
        int currentConsecutive=1;
        Arrays.sort(nums);


        for(int i=1; i<nums.length;i++ ){
             if(nums[i]-nums[i-1] == 1)
               currentConsecutive++;
             else if(nums[i]-nums[i-1] == 0){
               continue;
             }
             else{
                longestConsecutive = Math.max(longestConsecutive, currentConsecutive);
                currentConsecutive=1;
                continue;
             } 

            longestConsecutive = Math.max(longestConsecutive, currentConsecutive);

        }

        return longestConsecutive;
        
    }
}
