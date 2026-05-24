class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Integer> itemCount = new HashMap<>();
        boolean result=false;

        for(int item: nums){

            if(itemCount.get(item) == null){
                itemCount.put(item,1) ;
            }else {
                return true;
            }
        }

        return result;
        
    }
}