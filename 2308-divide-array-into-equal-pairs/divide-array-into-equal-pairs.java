class Solution {
    public boolean divideArray(int[] nums) {
        
        Map<Integer,Integer> eleMap=new HashMap<>();
        
        for(int num:nums){
            eleMap.put(num,eleMap.getOrDefault(num,0)+1);
        }
        
        for(int freq:eleMap.values()){
            if(freq%2!=0){
               return  false;
            }
        }
        return true;
    }
}