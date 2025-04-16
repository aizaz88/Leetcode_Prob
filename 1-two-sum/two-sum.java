class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int numberPresent=target-nums[i];
            if(map.containsKey(numberPresent)){
            return new int[] {map.get(numberPresent),i}; //index of that {number present,i}
            }
            map.put(nums[i],i);
        }

        return new int[] {};
    }
}