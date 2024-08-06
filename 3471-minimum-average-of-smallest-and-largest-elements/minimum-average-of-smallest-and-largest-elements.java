class Solution {
    public double minimumAverage(int[] nums) {
        List<Double> averages=new ArrayList<>();
        Arrays.sort(nums);
        int i=0,j=nums.length-1;
        int k=1;
        while(k<=nums.length/2){
            double avg=(nums[i]+nums[j])/2.0;
            averages.add(avg);
            i++;
            j--;
            k++;
        }
        
        double minAverage = Double.MAX_VALUE;
        for (double average : averages) {
            if (average < minAverage) {
                minAverage = average;
            }
        }
        return minAverage;
    }
}