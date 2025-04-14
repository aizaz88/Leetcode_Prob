class Solution {
    public int dominantIndex(int[] nums) {
        
        int largest=nums[0];
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest) {
                largest=nums[i];
                idx=i;
            }
        }
        

        for(int i=0;i<nums.length;i++){
            if(i!=idx && largest<nums[i]*2){
                return -1;
            }
        }

        return idx;
    }
}