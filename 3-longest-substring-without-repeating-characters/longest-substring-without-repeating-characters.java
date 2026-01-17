class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set=new HashSet<>();
        int maxLen=0,left=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);

            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);

            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}