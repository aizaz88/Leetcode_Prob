import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            Map<String,List<String>> anagram=new HashMap<>();

            for(String str:strs){
                char[] character=str.toCharArray();
                Arrays.sort(character);

                String key=new String(character);

                    if(!anagram.containsKey(key)){
                        anagram.put(key,new ArrayList<>());
                    }
                        anagram.get(key).add(str);
            }
            return new ArrayList<>(anagram.values());
    }
}

/*
Map<String,List<String>> anagrams=new HashMap<>();

            for(String str:strs){
                char[] characters=str.toCharArray();
                Arrays.sort(characters);

                String key=new String(characters);

            //computeIfAbsent---
                if (!anagrams.containsKey(key)) {
                anagrams.put(key, new ArrayList<>());
                            }
                    anagrams.get(key).add(str);

            }
            return new ArrayList<>(anagrams.values());
*/ 


 /*
 BRUTE-FORCE
        boolean[] visited = new boolean[strs.length]; 

        for (int i = 0; i < strs.length; i++) {
            if (visited[i]) continue; 

            List<String> list = new ArrayList<>();
            list.add(strs[i]);
            visited[i] = true;

            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    list.add(strs[j]);
                    visited[j] = true;
                }
            }

            resultList.add(list);
        }

        return resultList;
    }

    private boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        int[] charCount = new int[26]; 
        for (char c : str1.toCharArray()) charCount[c - 'a']++; 
        for (char c : str2.toCharArray()) charCount[c - 'a']--; 

        for (int count : charCount) {
            if (count != 0) return false; 
        }

        return true;
        */
