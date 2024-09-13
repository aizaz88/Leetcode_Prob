class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        
        int n=image.length;

        for(int i=0;i<n;i++){
            int left=0;
            int right=n-1;
            
            //swap element of each rows every column 
            while(left<=right){
                int temp=image[i][left];
                image[i][left]=image[i][right];
                image[i][right]=temp;
            
                 left++;
            right--;
            }
        }
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                image[i][j]=image[i][j]^1;//XOR covert 1 to 0 & 0 to 1
            }
        }
        return image;
    }
}