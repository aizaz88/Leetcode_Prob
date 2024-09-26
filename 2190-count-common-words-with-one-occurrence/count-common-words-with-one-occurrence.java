class Solution {
    public int countWords(String[] words1, String[] words2) {
        
        Map<String,Integer> word1freq=new HashMap<>();
                Map<String,Integer> word2freq=new HashMap<>();
        
        for(String word:words1){
            word1freq.put(word,word1freq.getOrDefault(word,0)+1);
        }
        
         for(String word:words2){
            word2freq.put(word,word2freq.getOrDefault(word,0)+1);
        }
        
        Set<String> set1=new HashSet<>();
        for(Map.Entry<String,Integer> e:word1freq.entrySet()){
            if(e.getValue()==1){
                set1.add(e.getKey());
            }
        }
               Set<String> set2=new HashSet<>();
        for(Map.Entry<String,Integer> e:word2freq.entrySet()){
            if(e.getValue()==1){
                set2.add(e.getKey());
            }
               }
               
               int count=0;
               for(String word:set1){
                   if(set2.contains(word)){
                       count++;
                   }
               }
               return count;
    }
}