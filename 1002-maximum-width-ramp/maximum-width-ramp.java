class Solution {
    public int maxWidthRamp(int[] nums) {
        
        int n=nums.length;
    
        Stack<Integer> stk=new Stack<>();
        
        for(int i=0;i<n;i++){
            if(stk.isEmpty() || nums[stk.peek()]>nums[i]){
                stk.push(i);
            }
        }
        
            int maxremp=0;
        for(int j=n-1;j>=0;j--){
            while(!stk.isEmpty() && nums[stk.peek()]<=nums[j]){
                maxremp=Math.max(maxremp,j-stk.pop());
            }
        }
        return maxremp;
    }
}
/*
for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]<=nums[j]){
                    int remp=j-i;
                    maxremp=Math.max(maxremp,remp);
                }
            }
        }
*/