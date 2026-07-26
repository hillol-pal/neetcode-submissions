class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length; //rows

        int n = matrix[0].length; // number of columns in each row

        int left = 0;

        int right = m*n -1;

        int mid = -1;

        while(left <= right){
           
           mid = (left + right)/2;
           
           if(target == matrix[mid/n][mid%n]){
              return true;
           }else if(target > matrix[mid/n][mid%n]){

              left = mid + 1;

           }else{

              right = mid -1;

           }

        }

        return false;


        
    }
}
