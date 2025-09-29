class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> anagram=new HashMap<>();
        for(String str:strs){
            char[] characters=str.toCharArray();
            Arrays.sort(characters);

            String key=new String(characters);
            if(!anagram.containsKey(key)){
                anagram.put(key,new ArrayList<>());
            }
            anagram.get(key).add(str);
        }
        return new ArrayList<>(anagram.values());
    }
}