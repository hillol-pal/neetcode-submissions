class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> items = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int first = nums[i];
            int second = target - first;

            if(items.containsKey(second)){
                return new int[] {items.get(second),i};
            }
            items.put(first,i);
        }
        throw new IllegalArgumentException("Data Doesn't have solution");
    }
}
