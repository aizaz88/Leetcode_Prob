class Solution {
    public int largestAltitude(int[] gain) {
        int altitude=0;
        int highestaltitude=0;
        for(int i=0;i<gain.length;i++){
            altitude=altitude+gain[i];
            if(altitude>highestaltitude){
                highestaltitude=altitude;
            }
        }
        return highestaltitude;
    }
}