class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        
        int sum=0;
        for(int i=0;i<nums.size();i++){
            int SetBit=Integer.bitCount(i);
            if(SetBit==k){
                sum+=nums.get(i);
            }
        }
        return sum;
    }
}