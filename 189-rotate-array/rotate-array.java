class Solution {
    public void rotate(int[] nums, int k) {
        int length=nums.length;
        k=k % length;
        if(k==0) return;
        int[] temp=new int[nums.length-k];
        int idx=0;

        for(int i=0;i<temp.length;i++){
            temp[i]=nums[i];
        }

        for(int i=nums.length-k;i<nums.length;i++){
            nums[idx++]=nums[i];
        }

        for(int i=0;i<temp.length;i++){
            nums[idx++]=temp[i];
        }
    }
}