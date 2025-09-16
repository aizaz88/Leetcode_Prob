class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        //Binary search algo (time complexity O(logm*n))
       int m=matrix.length;
       int n=matrix[0].length;

       int start=0;
       int end=m*n-1;

       while(start<=end){
        int mid=(start+end)/2;
        int midValue=matrix[mid/n][mid%n];

        if(midValue==target){
            return true;
        }else if(midValue>target){
            end=mid-1;
        }else{
            start=mid+1;
        }
       }
       return false;
        
        /*
        //Linear search algo(time complexity O(m x n))
          int m=matrix.length;
        int n=matrix[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
        */
    }
}