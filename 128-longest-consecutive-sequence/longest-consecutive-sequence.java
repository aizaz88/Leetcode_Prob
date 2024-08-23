class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length==0){
            return 0;
        }
        
        
      Set<Integer> numSet=new HashSet<>();
        for(int num:nums){
            numSet.add(num);
        }
        
            int longest=0;
        for(int num:numSet){
            if(!numSet.contains(num-1)){
                int length=1;
                int currnum=num;
                while(numSet.contains(currnum+1)){
                    length++;
                    currnum++;
                }
                longest=Math.max(length,longest);
            }
        }
        return longest;
    }
}