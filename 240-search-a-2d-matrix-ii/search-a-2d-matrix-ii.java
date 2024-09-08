class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int m=matrix.length;
        int n=matrix[0].length;
        //iterting rows 
        for(int i=0;i<m;i++){
            
            int start=0;
            int end=n-1;
            //iterating entries,elements within the row 
            while(start<=end){
                int mid=(start+end)/2;
                int midvalue=matrix[i][mid];
                if(midvalue==target){
                    return true;
                }else if(midvalue<target){
                    start=mid+1;
                }else{
                    end=mid-1;
                }
            }
            
        }
        return false;
    }
}