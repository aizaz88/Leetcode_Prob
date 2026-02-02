class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=findMax(piles);
        while(min<=max){
            int mid=(min+max)/2;
            long totalHours=totalHoursForKSpeed(piles,mid);

            if(totalHours>h){
                min=mid+1;
            }else{
                max=mid-1;
            }
        }
         return min;
    }
     //Helper function for maximum piles----
        private int findMax(int[] piles){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<piles.length;i++){
                max=Math.max(max,piles[i]);
            }
            return max;
        }

        //Helper function for total hours at k-speed
        private  long totalHoursForKSpeed(int piles[],int hour){
            int totalHour=0;
            for(int i=0;i<piles.length;i++){
                totalHour+=Math.ceil((double) piles[i]/hour);
            }
            return totalHour;
        }
}