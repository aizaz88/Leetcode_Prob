class Solution {
    public int numberOfWeakCharacters(int[][] properties) {
        Arrays.sort(properties,(a,b)->
        (a[0]==b[0]?a[1]-b[1]:b[0]-a[0])
        );

        int maxDefence=0;
        int counter=0;

        for(int[] ch:properties){
            if(ch[1]<maxDefence){
                counter++;
            }
            maxDefence=Math.max(maxDefence,ch[1]);
        }
        return counter;
    }
}