class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sAns=new int[26];
        int[] tAns=new int[26];

        for(char c:s.toCharArray()){
            sAns[c-'a']++;
        }

           for(char c:t.toCharArray()){
            tAns[c-'a']++;
        }

        if(Arrays.equals(sAns,tAns)){
            return true;
        }
       return  false;
    }
}