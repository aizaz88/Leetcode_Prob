class Solution {
    public int numIdenticalPairs(int[] nums) {
       Map<Integer,Integer> mapPair=new HashMap<>();
       int count=0;
       for(int n:nums){
        if(mapPair.containsKey(n)){
            count+=mapPair.get(n);
        }
        mapPair.put(n,mapPair.getOrDefault(n,0)+1);
       }
       return count;
    }
}