class Solution {
    public long countBadPairs(int[] nums) {
        
        //calclating good pairs and then subtracting them from all pairs returns bad pairs good approach
        int n=nums.length;
        long totalpairs=(long)n*(n-1)/2;
        
          Map<Integer,Integer> map=new HashMap<>();
        long goodpairs=0;
        for(int i=0;i<n;i++){
            int key=nums[i]-i;
            
            if(map.containsKey(key)){
                goodpairs+=map.get(key);
            }
            
            map.put(key,map.getOrDefault(key,0)+1);
        }
        
        return totalpairs-goodpairs;
    }
}