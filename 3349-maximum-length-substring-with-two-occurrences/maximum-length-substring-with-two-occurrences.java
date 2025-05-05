class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int ans=0;
        int[] charFreq=new int[26];

        for(int right=0;right<s.length();right++){
                int idx=s.charAt(right) - 'a';
                charFreq[idx]++;

                while(charFreq[idx]>2){
                    int leftIdx=s.charAt(left) - 'a';
                    charFreq[leftIdx]--;
                    left++;
                }

                ans=Math.max(ans,right - left + 1);
        }
        return ans;
    }
}