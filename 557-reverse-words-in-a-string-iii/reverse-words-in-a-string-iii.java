class Solution {
    public String reverseWords(String s) {
        
        String[] words=s.split(" ");
        StringBuilder result=new StringBuilder();
        
        for(int i=0;i<words.length;i++){
            String word=words[i];
                StringBuilder reverse=new StringBuilder(word);
            result.append(reverse.reverse());
            
            if(i<words.length-1){
                result.append(" ");
                }
            }
        
        return result.toString();
    }
}