class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        List<Integer> even=new ArrayList<>();
                List<Integer> odd=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }else{
                odd.add(nums[i]);
            }
        }
        
        int[] result=new int[nums.length];
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<result.length;i++){
            if(i%2==0){
                
                result[i]=even.get(evencount);
                evencount++;
            }else{
                
                 result[i]=odd.get(oddcount);
                oddcount++;

            }
        }
return result;
    }
}