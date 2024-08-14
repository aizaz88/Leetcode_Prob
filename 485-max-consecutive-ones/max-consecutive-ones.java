class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int count=0;
        int consec=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                consec=Math.max(consec,count);
            }
            else{
            count=0;    
            }
        }
        return consec;
    }
}