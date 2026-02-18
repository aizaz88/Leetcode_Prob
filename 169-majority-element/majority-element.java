class Solution {
    public int majorityElement(int[] nums) {
        int vote=1;
        int candidate=nums[0];
        for(int i=1;i<nums.length;i++){
            if(vote==0){
                candidate=nums[i];
                vote++;
            }else if(candidate==nums[i]){
                vote++;
            }else{
                vote--;
            }
        }
        return candidate;
    }
}