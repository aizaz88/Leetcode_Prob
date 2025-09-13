class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> AlphabetFreq=new HashMap<>();
        for(char ch:s.toCharArray()){
            AlphabetFreq.put(ch,AlphabetFreq.getOrDefault(ch,0)+1);
        }

            int vowelFreq=0;
            int consonentFreq=0;

       for( Map.Entry<Character,Integer> e: AlphabetFreq.entrySet()){
                char c=e.getKey();
                int freq=e.getValue();
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ){
               vowelFreq=Math.max(freq,vowelFreq);
            }else{
                consonentFreq=Math.max(freq,consonentFreq);
            }

       }
       return vowelFreq+consonentFreq;
    }
}