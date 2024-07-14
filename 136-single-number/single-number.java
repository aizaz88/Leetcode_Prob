class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> singlemap=new HashMap<>();
        
        for(int n:nums){
            singlemap.put(n,singlemap.getOrDefault(n,0)+1);
        }
        
        int single=0;
        for(Map.Entry<Integer,Integer> e:singlemap.entrySet()){
            if(e.getValue()==1){
                 single=e.getKey();
            }
        }
        return single;
    }
}