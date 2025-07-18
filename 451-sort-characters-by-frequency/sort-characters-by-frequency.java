class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freqMap=new HashMap<>();
        for(char ch:s.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }

        List<Character> list=new ArrayList<>();
        for(char ch:s.toCharArray()){
            list.add(ch);
        }

        Collections.sort(list,(a,b)->{
            int freqDiff=freqMap.get(b)-freqMap.get(a);
            return freqDiff!=0?freqDiff:a-b;
        });

        StringBuilder str=new StringBuilder();
        for(char ch:list){
            str.append(ch);
        }
        return str.toString();
    }
}

/*
 Map<Character,Integer> freqMap=new HashMap<>();
        for(char ch:s.toCharArray()){
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        
      List<Character> list=new ArrayList<>();
        for(char ch:s.toCharArray()){
            list.add(ch); 
        }
        
        Collections.sort(list,(a,b)->{
            int freqdiff=freqMap.get(b)-freqMap.get(a);
            return freqdiff!=0?freqdiff:a-b;
        });
        
        StringBuilder str=new StringBuilder();
        for(char ch:list){
            str.append(ch);
        }
        
        return str.toString();
*/