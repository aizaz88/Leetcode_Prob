class Solution {
    public void setZeroes(int[][] matrix) {
        int rows=matrix.length;
        int cols=matrix[0].length;

        boolean[] rowsZero=new boolean[rows];
        boolean[] colsZero=new boolean[cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]==0){
                    rowsZero[i]=true;
                    colsZero[j]=true;
                }
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(rowsZero[i] || colsZero[j]){
                    matrix[i][j]=0;
                }
            }
        }
    }
}