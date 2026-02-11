class Solution {
    public long numberOfWeeks(int[] milestones) {
       /*
       max = largest milestone
       sum = sum of all milestones
       rest = sum - max

       max <= rest + 1--->return sum
       max > rest + 1 --->return 2*rest+1
       */


       long sum=0;
       long max=0;

       for(int n:milestones){
        sum+=n;
        max=Math.max(max,n);
       }

        long rest=sum-max;

       if(max<=rest+1){
        return sum;
       }
       return 2*rest+1;
    }
}