class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        
        Set<Double> distinct=new HashSet<>();
        
        while(i<j){
          double avg=(nums[i]+nums[j])/2.0;
            distinct.add(avg);
            i++;
            j--;
        }
        return distinct.size();
    }
}