class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> items = new HashMap<>();

        int[] result = {0,0};

        for(int i=0;i< nums.length;i++){
            items.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int first = nums[i];
            int second = target - first;

            if(items.containsKey(second) && items.get(second)!=i){
                result[0] = i;
                result[1] = items.get(second);
                return result;
            }
        }
        return result;
    }
}
