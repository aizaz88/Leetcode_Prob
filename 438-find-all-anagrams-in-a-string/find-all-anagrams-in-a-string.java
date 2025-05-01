class Solution {
    public List<Integer> findAnagrams(String s, String p) {
            List<Integer> list=new ArrayList<>();
            if(s.length()<p.length()) return list;

            int[] pCharFreq=new int[26];
            int[] sCharFreq=new int[26];
            int window=p.length();
            
            for(char c:p.toCharArray()){
                pCharFreq[c-'a']++;
            }

            for(int i=0;i<window;i++){
                sCharFreq[s.charAt(i)-'a']++;
            }

            //1st Window check 
            if(Arrays.equals(sCharFreq,pCharFreq)) list.add(0);

            for(int i=window;i<s.length();i++){
                sCharFreq[s.charAt(i-window)-'a']--;
                sCharFreq[s.charAt(i)-'a']++;

                if(Arrays.equals(sCharFreq,pCharFreq)) list.add(i-window+1);
            }

            return list;
    }
}