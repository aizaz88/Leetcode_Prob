class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        
        List<Integer> listResult=new ArrayList<>();

        int rows=grid.length;
        int cols=grid[0].length;

        for(int i=0;i<rows;i++){
            if(i%2==0){ //---------even rows (from left to right )
        for(int j=0;j<cols;j++){
            if((i+j)%2==0){      //--------Skip 
                listResult.add(grid[i][j]);
            }
        }
    }else{
        for(int j=cols-1;j>=0;j--){
             if((i+j)%2==0){      //--------Skip 
                listResult.add(grid[i][j]);
            }
        }
    } 
        }

        return listResult;
    }
}