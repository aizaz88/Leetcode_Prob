class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
       List<Integer> evenlist=new ArrayList<>();
               List<Integer> oddlist=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                evenlist.add(nums[i]);
            }else{
                oddlist.add(nums[i]);
            }
        }
        
        evenlist.addAll(oddlist);
        
        int[] result=new int[evenlist.size()];
        for(int i=0;i<evenlist.size();i++){
            result[i]=evenlist.get(i);
        }
        
        return result;

    }
}