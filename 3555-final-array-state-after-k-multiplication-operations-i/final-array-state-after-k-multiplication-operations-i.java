class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        
        int op=0;
        while(op!=k){
            int minIndex=minimum(nums);
            nums[minIndex]=nums[minIndex]*multiplier;
            op++;
        }
        return nums;
    }
    private int minimum(int[] nums){
        int min=nums[0];
        int minIndex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
                minIndex=i;
            }
        }
        return minIndex;
    }
}