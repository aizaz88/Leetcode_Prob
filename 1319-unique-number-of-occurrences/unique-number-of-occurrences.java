class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        //map of values 
      Map<Integer,Integer> occurmap=new HashMap<>();
        
        for(int count:map.values()){
            occurmap.put(count,occurmap.getOrDefault(count,0)+1);
        }
        
        for(int count:occurmap.values()){
            if(count>1){
                return false;
            }
        }
        return true;
    }
}