class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int[] vacancy=new int[rocks.length];
        //VACANCY ARRAY
        for(int i=0;i<rocks.length;i++){
            vacancy[i]=capacity[i]-rocks[i];
        }
        //SORT ASCENDING VACANCY
        Arrays.sort(vacancy);

        //BAG-FILLING
        int full_bags=0;
            for(int n:vacancy){
                if(n<=additionalRocks){
                    additionalRocks-=n;
                full_bags++;
                }else{
                    break;
                }
            }

            return full_bags;
    }
}