class Solution {
    public int[] sortedSquares(int[] nums) {
       int n=nums.length;
       int[] result=new int[n];

       int left=0,right=n-1;
       int idx=n-1;

       while(left<=right){
        int leftSq=nums[left]*nums[left];
        int rightSq=nums[right]*nums[right];

        if(leftSq>rightSq){
            result[idx--]=leftSq;
            left++;
        }else{
            result[idx--]=rightSq;
            right--;
        }
    }

        return result;
    }
}
