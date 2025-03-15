import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>> resultMap=new HashMap<>();
        for(String str:strs){
            int[] countChar=new int[26];
            for(char c :str.toCharArray()){
                countChar[c-'a']++;
            }

        String key=Arrays.toString(countChar);

     resultMap.computeIfAbsent(key, k-> new ArrayList<>()).add(str);

        }
        return new ArrayList<>(resultMap.values());
    }
}

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
