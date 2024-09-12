class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> charset=new HashSet<>();
        for(char ch:allowed.toCharArray()){
            charset.add(ch);
        }
        
        int consistent=0;
        for(String word:words){
            boolean isConsistent=true;
            for(char ch:word.toCharArray()){
                if(!charset.contains(ch)){
                    isConsistent=false;
                    break;
                }
            }
            if(isConsistent){
                consistent++;
            }
        }
        
        return consistent;
    }
}