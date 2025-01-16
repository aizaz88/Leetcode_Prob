class Solution {
    public int minimumLength(String s) {
        HashMap<Character,Integer> freqMap=new HashMap<>();
        for(char ch:s.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }

    int length=0;
        for(HashMap.Entry<Character,Integer> e : freqMap.entrySet()){
            if(e.getValue()%2==0){
                length+=2;
            }else{
                length++;
            }
        }
        return length;
    }
}