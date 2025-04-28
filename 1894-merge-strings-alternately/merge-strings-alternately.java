class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str=new StringBuilder();
        int i=0,j=0;
        int m=word1.length(),n=word2.length();
        while(i<m & j<n){
            str.append(word1.charAt(i++));
            str.append(word2.charAt(j++));
        }

        while(i<m){
            str.append(word1.charAt(i++));
        }

        while(j<n){
            str.append(word2.charAt(j++));
        }

        return str.toString();
    }
}