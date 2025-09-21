class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0) return 0;

        int attackSeconds=0;
        for(int i=0;i<timeSeries.length-1;i++){
            attackSeconds+=Math.min(duration,timeSeries[i+1]-timeSeries[i]);
        }
        attackSeconds+=duration;
        return attackSeconds;
    }
}