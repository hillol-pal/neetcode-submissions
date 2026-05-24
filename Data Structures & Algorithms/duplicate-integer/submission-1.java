class Solution {
    public boolean hasDuplicate(int[] nums) {

        Set<Integer> items = new HashSet<>();
 

        for(int item: nums){

            if(items.contains(item)){
             return true;
            }
            items.add(item);
        }

        return false;
        
    }
}