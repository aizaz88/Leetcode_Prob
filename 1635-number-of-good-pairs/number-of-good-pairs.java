class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> freq=new HashMap<>();
        int count=0;
        for(int n:nums){
            if(freq.containsKey(n)){
                count+=freq.get(n);
            }
            freq.put(n,freq.getOrDefault(n,0)+1);
        }
        return count;
    }
}