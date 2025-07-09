class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long left=1;
        long right=(long) 1e14;
        long answer=right;

        while(left<=right){
            long mid=left+(right-left)/2;

            if(canCompleteTrips(time,totalTrips,mid)){
                answer=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return answer;
    }

    private boolean canCompleteTrips(int[] time,int totalTrips,long currTime){
        long trips=0;
        for(int t:time){
            trips+=currTime/t;
            if(trips>=totalTrips) return true;
        }
        return false;
    }
}