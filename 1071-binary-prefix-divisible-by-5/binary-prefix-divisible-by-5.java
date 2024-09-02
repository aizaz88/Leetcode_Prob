class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        
            List<Boolean> result=new ArrayList<>();
        int currNum=0;
        for(int i=0;i<nums.length;i++){
            currNum=(currNum*2+nums[i])%5;
         result.add(currNum==0);
        }
        return result;
    }
}