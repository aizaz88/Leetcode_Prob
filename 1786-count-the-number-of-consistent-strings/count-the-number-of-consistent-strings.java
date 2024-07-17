class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
        Set<Character> allowedset=new HashSet<>();
        for(char c:allowed.toCharArray()){
            allowedset.add(c);
        }
        int count=0;
        for(String word:words){
            if(isConsistent(word,allowedset)){
                count++;
            }
        }
        return count;
    }
    
    //isconsistent function
    private boolean isConsistent(String word,Set<Character> allowedset){
        for(char c:word.toCharArray()){
            if(!allowedset.contains(c)){
                return false;
            }
        }
        return true;
    }
}