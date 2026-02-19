/*
       Algorithm
   1. If total gas < total cost, return -1 (impossible)
   2. Track current tank and starting station
   3. If current tank becomes negative, start from next station and reset tank
   4. The greedy choice: if we can't continue from current start, 
      the next valid start must be after the current position

*/ 

class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currTank=0;
        int startingStation=0;
        int totalTank=0;

        for(int i=0;i<gas.length;i++){
            totalTank+=gas[i]-cost[i];
            currTank+=gas[i]-cost[i];

            if(currTank<0){
                startingStation=i+1;
                currTank=0;
            }

         
        }
           return totalTank>=0?startingStation:-1;
    }
}