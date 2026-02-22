class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int currMax=0;

        for(int i=0;i<nums.length;i++){
             if(currMax<0){
                currMax=nums[i];
             }else{
                currMax+=nums[i];
             }

            if(currMax>maxSum){
                maxSum=currMax;
            }
        }
        return maxSum;
    }
}