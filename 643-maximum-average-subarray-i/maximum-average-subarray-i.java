class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double max_avg=Double.NEGATIVE_INFINITY;

        for(int i=0;i<=nums.length-k;i++){
            int sum=0;
            for(int j=0;j<k;j++){
                sum+=nums[i+j];
            }
          max_avg=Math.max(max_avg,(double)sum/k);
        }
        return max_avg;
    }
}
/*
double max_avg=0;
        int a=k;
        for(int i=0;i<nums.length-k;i++){
            int sum=0;
            if(a<nums.length){
                for(int j=i;j<a;j++){
                sum+=nums[i+j];
             }
            }
            a++;
          max_avg=Math.max(max_avg,sum/k);
        }
*/