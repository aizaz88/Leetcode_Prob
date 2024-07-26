class Solution {
    public int countCharacters(String[] words, String chars) {
        
        Map<Character,Integer> charmap=new HashMap<>();
        for(char ch:chars.toCharArray()){
            charmap.put(ch,charmap.getOrDefault(ch,0)+1);
        }
        
        int totallength=0;
        for(String word:words){
            if(makeWordswithChar(word,charmap)){
                totallength+=word.length();
            }
        }
        return totallength;
    }
    
    private boolean makeWordswithChar(String word,Map<Character,Integer> charmap){
        Map<Character,Integer> wordmap=new HashMap<>();
        for(char ch:word.toCharArray()){
            wordmap.put(ch,wordmap.getOrDefault(ch,0)+1);
        }
        
        for(char ch:wordmap.keySet()){
            if(wordmap.get(ch)>charmap.getOrDefault(ch,0)){
                return false;
            }
        }
        return true;
    }
}