class Solution {
    public List<Integer> majorityElement(int[] nums) {
    
           List<Integer> list=new ArrayList<Integer>();
        if(nums==null || nums.length==0){
            return list;
        }
        int n=nums.length;
        int majority=n/3;
       
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int num:nums){
       map.put(num,map.getOrDefault(num,0)+1);     
        }
        
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()>majority){
                list.add(e.getKey());
            }
        }
        return list;
    }
}