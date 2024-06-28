class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
               //Brute force method
        // for(int i=0;i<nums.length-1;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]==nums[j] && Math.abs(i-j)<=k){
        //             return true;
        //         }
        //     }
        // }
        // return false;
        
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int j=map.get(nums[i]);
                if(i-j<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}