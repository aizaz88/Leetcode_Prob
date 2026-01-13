class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> freqMap=new HashMap<>();
        
        int count=0;
        for(int n:nums){
            if(freqMap.containsKey(n)){
                count+=freqMap.get(n);
            }
            freqMap.put(n,freqMap.getOrDefault(n,0)+1);
        }
        return count;
    }
}