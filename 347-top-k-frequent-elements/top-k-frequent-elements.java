class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freqMap=new HashMap<>();

        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> entryList=new ArrayList<>(freqMap.entrySet());
        entryList.sort((a,b)-> b.getValue()-a.getValue());

    int[] result=new int[k];
    for(int i=0;i<k;i++){
        result[i]=entryList.get(i).getKey();
    }

    return result;
        }
}




