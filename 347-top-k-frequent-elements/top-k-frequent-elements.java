class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> freqmap=new HashMap<>();
        
        for(int n: nums){
            freqmap.put(n,freqmap.getOrDefault(n,0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> entrylist=new ArrayList<>(freqmap.entrySet());
         entrylist.sort((a, b) -> b.getValue() - a.getValue());
        
        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=entrylist.get(i).getKey();
        }
        return result;
    }
}