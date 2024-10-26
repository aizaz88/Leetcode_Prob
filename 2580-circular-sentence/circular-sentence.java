class Solution {
    public boolean isCircularSentence(String sentence) {
        
        String[] words=sentence.split(" ");
        
        for(int i=1;i<words.length;i++){
            char currlast=words[i-1].charAt(words[i-1].length()-1);
            char nextfirst=words[i].charAt(0);
                if(currlast!=nextfirst){
                    return false;
                }
        }
        char firstchar=words[0].charAt(0);
        char lastchar=words[words.length - 1].charAt(words[words.length - 1].length() - 1);
        if(firstchar!=lastchar){
            return false;
        }
        return true;
    }
}