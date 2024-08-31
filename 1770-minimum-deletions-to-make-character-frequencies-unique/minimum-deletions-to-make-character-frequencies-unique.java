class Solution {
    public int minDeletions(String s) {
        
        Map<Character,Integer> charmap=new HashMap<>();
        for(char ch:s.toCharArray()){
            charmap.put(ch,charmap.getOrDefault(ch,0)+1);
        }
        
        Set<Integer> freqset=new HashSet<>();
    int charcount=0;

        for(int freq:charmap.values()){
            while(freq>0 && freqset.contains(freq)){
                freq--;
                charcount++;
            }
            freqset.add(freq);
        }
        return charcount;
    }
}