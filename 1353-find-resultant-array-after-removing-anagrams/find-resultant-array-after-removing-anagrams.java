class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> resultList=new ArrayList<>();
        resultList.add(words[0]);

        for(int i=1;i<words.length;i++){
            if(!isAnagram(words[i-1],words[i])){
                resultList.add(words[i]);
            }
        }
        return resultList;
    }
    private boolean isAnagram(String word1,String word2){
        int[] charCount=new int[26];

        for(char c:word1.toCharArray()){
            charCount[c-'a']++;
        }

        for(char c:word2.toCharArray()){
            charCount[c-'a']--;
        }

        for(int count:charCount){
            if(count!=0) return false;
        }
        return true;
    }
}