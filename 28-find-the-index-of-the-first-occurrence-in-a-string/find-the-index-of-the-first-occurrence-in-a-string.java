class Solution {
    public int strStr(String haystack, String needle) {
        
        if (needle.isEmpty()) {
            return 0;
        }
        
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}