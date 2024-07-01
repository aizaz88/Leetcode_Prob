class Solution {
    public boolean areOccurrencesEqual(String s) {
        
        Map<Character,Integer> map=new HashMap<>();
        
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        int frequency=-1;
        for(int count: map.values()){
            if(frequency==-1){
                frequency=count;
            }else if(frequency!=count){
                return false;
            }
        }
        return true;
    }
}