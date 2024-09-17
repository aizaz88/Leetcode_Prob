class Solution {
    public int[] countBits(int n) {
            
        int[] result=new int[n+1];
        
        for(int i=0;i<=n;i++){
            int bits=Integer.bitCount(i);
            result[i]=bits;
        }
        return result;
    }
}