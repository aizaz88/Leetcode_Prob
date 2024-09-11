class Solution {
    
    //Helper function to check prime setbits
    private boolean isPrimesetBit(int n){
        
        if(n<2) return false;
        
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    
    public int countPrimeSetBits(int left, int right) {
        
        int count=0;
        
        for(int i=left;i<=right;i++){
            int setbit=Integer.bitCount(i);
            
            if(isPrimesetBit(setbit)){
                count++;
            }
            
        }
            return count;
    }  
}