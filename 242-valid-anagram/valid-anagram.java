class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] sAna=new int[26];
        int[] tAna=new int[26];

        for(char c:s.toCharArray()){
            sAna[c-'a']++;
        }

        for(char c:t.toCharArray()){
            tAna[c-'a']++;
        }

        if(Arrays.equals(sAna,tAna)){
            return true;
        }
        return false;

    }
}