class Solution {
    public int[] productExceptSelf(int[] nums) {

      int[] leftProducts = new int[nums.length];
      int[] rightProducts = new int[nums.length];
      int[] result = new int[nums.length];

      leftProducts[0]=nums[0] * 1;
      rightProducts[nums.length - 1]=nums[nums.length - 1] * 1;

      for(int i=1,j=nums.length-2;i<nums.length;i++,j--){
           leftProducts[i] = nums[i] * leftProducts[i-1]; // [1,2,8,48]
           rightProducts[j] = nums[j] * rightProducts[j+1]; // [48,48,24,6]
           
      } 

      result[0] = rightProducts[1];
      result[nums.length-1] = leftProducts[nums.length-2];

      for(int k=1;k<nums.length-1;k++){
         result[k] = leftProducts[k-1]*rightProducts[k+1];
      }

      return result;
        
    }
}  
