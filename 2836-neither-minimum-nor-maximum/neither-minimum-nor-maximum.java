class Solution {
    public int findNonMinOrMax(int[] nums) {
        Arrays.sort(nums);
        int min=nums[0];
        int max=nums[nums.length-1];
        if(nums.length<3){
            return -1;
        }
        return nums[1];
    }
}