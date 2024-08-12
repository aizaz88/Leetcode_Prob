class Solution {
    public int[] numberOfPairs(int[] nums) {
        
       
     Map<Integer,Integer> numMap=new HashMap<>();
        for(int num:nums){
            numMap.put(num,numMap.getOrDefault(num,0)+1);
        }
        
         int count=0;
        int leftOver=0;
        for(Map.Entry<Integer,Integer> e:numMap.entrySet()){
            
           count+=e.getValue()/2;
                             
            leftOver+=e.getValue()%2;
        }
        
       return new int[]{count, leftOver};
    }
}