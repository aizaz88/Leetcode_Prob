class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {

        Map<Integer,Integer> freq=new HashMap<>();

        int left=0;
        long maxSum=0;
        long sum=0;
        
        for(int right=0;right<nums.size();right++){
            int num=nums.get(right);
            freq.put(num,freq.getOrDefault(num,0)+1);
            sum+=num;

            //right-left+1-> window size
            if(right-left+1>k){
                int leftNum=nums.get(left);
                freq.put(leftNum,freq.get(leftNum)-1);
                if (freq.get(leftNum) == 0) freq.remove(leftNum);
                sum-=leftNum;
                left++;
            }

            //Check for window size exactly k
            if(right-left+1==k){
                if(freq.size()>=m){
                    maxSum=Math.max(maxSum,sum);
                }
            }
        }
        return maxSum;
    }
}