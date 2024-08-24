class Solution {
    public int maximumStrongPairXor(int[] nums) {
        
        int max_xor=0;
        for(int i=0;i<nums.length;i++){
             for(int j=0;j<nums.length;j++){
                 
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])){
                    
                    int bitwise_xor=nums[i]^nums[j];
                    max_xor=Math.max(bitwise_xor,max_xor);
                }
                 
             }
        }
        return max_xor;
    }
}