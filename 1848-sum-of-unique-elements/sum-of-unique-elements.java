class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }
        
        int sum=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                sum=sum+e.getKey();
            }
        }
        return sum;
    }
}