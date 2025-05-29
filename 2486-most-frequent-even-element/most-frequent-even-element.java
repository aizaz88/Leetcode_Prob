class Solution {
    public int mostFrequentEven(int[] nums) {

        HashMap<Integer,Integer> mapFreq=new HashMap<>();
        for(int n:nums){
            if(n%2==0){
                mapFreq.put(n,mapFreq.getOrDefault(n,0)+1);
            }
        }

        int maxFrequent=0;
        int ele=-1;
        for(Map.Entry<Integer,Integer> e:mapFreq.entrySet()){
            int key=e.getKey();
            int freq=e.getValue();

            if(freq>maxFrequent || (freq==maxFrequent && key<ele)){
                maxFrequent=freq;
                ele=key;
            }
        }

            return ele;
    }
}