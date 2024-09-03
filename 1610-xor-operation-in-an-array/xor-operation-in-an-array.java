class Solution {
    public int xorOperation(int n, int start) {
        
        int[] nums=new int[n];
        int Xor=0;
        for(int i=0;i<n;i++){
            nums[i]=start+2*i;
            Xor=Xor^nums[i];
        }
        return Xor;
    }
}