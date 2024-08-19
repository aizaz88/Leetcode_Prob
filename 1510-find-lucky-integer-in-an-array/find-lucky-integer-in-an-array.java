class Solution {
    public int findLucky(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        int key=-1;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getKey()==e.getValue()){
                key= e.getKey();
            }
        }
        return key;
    }
}