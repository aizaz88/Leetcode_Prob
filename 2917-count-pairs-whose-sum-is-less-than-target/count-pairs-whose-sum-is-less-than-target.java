class Solution {
    public int countPairs(List<Integer> nums, int target) {
        
        //given an list of array ...need list function of size() and accessing with get()
        int counter=0;
        
        for(int i=0;i<nums.size()-1;i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)<target){
                    counter++;
                }
            }
        }
        return counter;
    }
}