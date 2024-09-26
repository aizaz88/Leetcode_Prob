class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int max_words=0;
        for(int i=0;i<sentences.length;i++){
            String sentence=sentences[i];
            String[] words=sentence.split(" ");
            
             max_words=Math.max(words.length,max_words);
        }
        
        return max_words;
    }
}