class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int result=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==2){
                result^=e.getKey();
            }
        }
        return result;
    }
}