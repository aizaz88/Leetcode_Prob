class Solution {
    public int countNegatives(int[][] grid) {
        
        int m=grid.length;
        int n=grid[0].length;
        
        int count=0;
        for(int i=0;i<m;i++){
            int left=0;
            int right=n-1;
            
            while(left<=right){
                int mid=left+(right-left)/2;
                
                if(grid[i][mid]<0){
                    right=mid-1;
                }else{
                    left=mid+1;
                }
            }
       count+=(n-left);

        }
        
        return count;
        
        /*
        int m=grid.length;
        int n=grid[0].length;
        
        int count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]<0){
                    count++;
                }
            }
        }
        return count;
        */
    }
}