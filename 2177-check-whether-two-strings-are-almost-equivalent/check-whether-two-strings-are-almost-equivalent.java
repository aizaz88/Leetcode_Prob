class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        
        Map<Character,Integer> word1map=new HashMap<>();
                Map<Character,Integer> word2map=new HashMap<>();

        for(char ch:word1.toCharArray()){
            word1map.put(ch,word1map.getOrDefault(ch,0)+1);
        }
        
         for(char ch:word2.toCharArray()){
            word2map.put(ch,word2map.getOrDefault(ch,0)+1);
        }
        
        for(char ch='a' ;ch<='z';ch++){
            int freq1=word1map.getOrDefault(ch,0);
            int freq2=word2map.getOrDefault(ch,0);
            
            if(Math.abs(freq1-freq2)>3){
                return false;
            }
        }
        return true;
    }
}