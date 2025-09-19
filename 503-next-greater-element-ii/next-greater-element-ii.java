class Solution {
    public int[] nextGreaterElements(int[] nums) {
       int n=nums.length;
       int[] res=new int[n];
       Stack<Integer> st=new Stack<>();

       for(int i=0;i<res.length;i++){
            res[i]=-1;
       }

       for(int i=0;i<2*n;i++){
            int idx=i%n;
                while(!st.isEmpty() && nums[st.peek()]<nums[idx]){
                    res[st.pop()]=nums[idx];
                }
                    if(i<n){
                        st.push(idx);
                    }
             }

             return res; 
    }
}

