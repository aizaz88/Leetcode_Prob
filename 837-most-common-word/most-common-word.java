class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        
        paragraph=paragraph.toLowerCase().replaceAll("[^a-z]"," ");
        
        String[] words=paragraph.split("\\s+");
        
        Set<String> bannedword=new HashSet<>(Arrays.asList(banned));
        
        Map<String,Integer> map=new HashMap<>();
        for(String word:words){
            if(!bannedword.contains(word)){
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        
        String common="";
        int maxcount=0;
        
        for(Map.Entry<String,Integer> e: map.entrySet()){
            if(e.getValue()>maxcount){
                common=e.getKey();
                maxcount=e.getValue();
            }
        }
        return common;
    }
}