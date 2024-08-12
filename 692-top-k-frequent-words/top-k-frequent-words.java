class Solution {
    public List<String> topKFrequent(String[] words, int k) {
     
        Map<String,Integer> wordmap=new HashMap<>();
        for(String str:words){
            wordmap.put(str,wordmap.getOrDefault(str,0)+1);
        }
        
        List<String> list=new ArrayList<>(wordmap.keySet());
       
        list.sort((word1,word2)->{
            int freq1=wordmap.get(word1);
            int freq2=wordmap.get(word2);
            if(freq1==freq2){
                return word1.compareTo(word2);
            }
            return freq2-freq1;
        });
        
        return list.subList(0,k);
    }
}