class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> freqelement=new HashMap<>();
        
        for(int n:nums){
            freqelement.put(n,freqelement.getOrDefault(n,0)+1);
        }
        
        int maxfreq=0;
        int smalleven=-1;
        for(Map.Entry<Integer,Integer> e:freqelement.entrySet()){
            int num=e.getKey();
            int freq=e.getValue();
            if(num%2==0){
              if(freq>maxfreq){
                    maxfreq=freq;
                    smalleven=num;
                }else if(freq==maxfreq && num<smalleven){
                    smalleven=num;
                }
            }
        }
        return smalleven;
    }
}