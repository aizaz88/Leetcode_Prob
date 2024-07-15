class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        
        Map<String,Integer> wordmap=new HashMap();
        String str=s1+" "+s2;
        for(String word:str.split(" ")){
            wordmap.put(word,wordmap.getOrDefault(word,0)+1);
        }
        
        List<String> list=new ArrayList<>();
        
        for(Map.Entry<String,Integer> e:wordmap.entrySet()){
            if(e.getValue()==1){
                list.add(e.getKey());
            }
        }
        return list.toArray(new String[0]);
    }
}