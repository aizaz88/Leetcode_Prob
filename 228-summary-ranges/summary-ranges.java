class Solution {
    public List<String> summaryRanges(int[] nums) {
        
        List<String> list=new ArrayList<>();
        
        if(nums==null || nums.length==0){
            return list;
        }
        
        int start=nums[0];
        int end=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==end+1){
                end=nums[i];
            }else{
                if(start==end){
                    list.add(String.valueOf(start));
                }else{
                    list.add(start+"->"+end);
                }
            start=nums[i];
            end=nums[i];
            }
        }
        
       if (start == end) {
            list.add(String.valueOf(start));
        } else {
            list.add(start + "->" + end);
        }
        return list;
    }
}