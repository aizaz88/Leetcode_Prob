class Solution {
    
    private void Rotate90(int[][] mat){
         int n=mat.length;
        
        //transpose..........
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
                
            }
        }
        
        //Reverse each row..........
        for(int i=0;i<n;i++){
            
                int start=0,end=n-1;    
                while(start<=end){
                    int temp=mat[i][start];
                    mat[i][start]=mat[i][end];
                    mat[i][end]=temp;
                    
                    start++;
                    end--;
                }
        }
    }
    
    
    private boolean isBothEqual(int[][] mat,int[][] target){
         //check..................................
        int n=mat.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public boolean findRotation(int[][] mat, int[][] target) {
        
          for(int rotate=0;rotate<4;rotate++){
              
              if(isBothEqual(mat,target)){
                  return true;
              }
              
              Rotate90(mat);
          }
        return false;
    }
}