class Solution {
    public int subarraySum(int[] nums, int k) {
        
        Map<Integer,Integer> summap=new HashMap<>();
        summap.put(0,1);
        
        int count=0;
        int cumsum=0;
        for(int num:nums){
            cumsum+=num;
            
            if(summap.containsKey(cumsum-k)){
                count+=summap.get(cumsum-k);
            }
            summap.put(cumsum,summap.getOrDefault(cumsum,0)+1);
        }
        return count;
    }
}