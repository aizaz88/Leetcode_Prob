class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int cnst=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                cnst++;
            }else{
                cnst=0;
            }
            max=Math.max(max,cnst);
        }
        return max;
    }
}