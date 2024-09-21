class Solution {
    public int[] frequencySort(int[] nums) {
        
        //freq map
        Map<Integer,Integer> freqMap=new HashMap<>();
        for(int num:nums){
            freqMap.put(num,freqMap.getOrDefault(num,0)+1);
        }
        
            List<Integer> list=new ArrayList<>();
        for(int n:nums){
            list.add(n);
        }
        
        Collections.sort(list,(a,b)->{
            int freqA=freqMap.get(a);
            int freqB=freqMap.get(b);

            if(freqA==freqB){
                return b-a;
            }else{
                return freqA-freqB;
            }
        });
        
        int[] nums2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            nums2[i]=list.get(i);
        }
        return nums2;
    }
}