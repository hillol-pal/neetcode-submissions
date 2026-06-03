class Solution {
    public int maxArea(int[] heights) {

        int left=0;
        int right=heights.length - 1;

        int maxArea = 0;

        while(left < right){

            int currValue = Math.min(heights[left],heights[right]) * (right - left);

            if(currValue > maxArea){
                maxArea = currValue;
            }

            if(heights[left] > heights[right])
               right--;
            else
               left++;
        }
        
        return maxArea;
    }
}
