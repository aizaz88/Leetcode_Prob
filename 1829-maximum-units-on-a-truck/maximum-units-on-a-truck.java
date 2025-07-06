class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {

       Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1],a[1]));

       int maxUnits=0;

       for(int[] box:boxTypes){
        int boxes=box[0];
        int unitsBox=box[1];
    
    if(truckSize>=boxes){
        maxUnits+=boxes*unitsBox;
        truckSize-=boxes;
    }else{
        maxUnits+=truckSize*unitsBox;
        break;
    }
       }
       return maxUnits;
    }
}