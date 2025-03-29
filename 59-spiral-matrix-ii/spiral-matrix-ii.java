class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int start=1,end=n*n;

        int rowS=0,rowE=n-1;
        int colS=0,colE=n-1;

        while(start<=end){
            for(int i=colS;i<=colE;i++){
            matrix[rowS][i]=start++;
        }
        rowS++;

        for(int i=rowS;i<=rowE;i++){
            matrix[i][colE]=start++;
        }
        colE--;

        if(rowS<=rowE){
            for(int i=colE;i>=colS;i--){
            matrix[rowE][i]=start++;
        }
        rowE--;
        }

        if(colS<=colE){
            for(int i=rowE;i>=rowS;i--){
            matrix[i][colS]=start++;
        }
        colS++;
        }
        
            }
        return matrix;
    }
}