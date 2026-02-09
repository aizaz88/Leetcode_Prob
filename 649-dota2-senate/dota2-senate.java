class Solution {
    public String predictPartyVictory(String senate) {
        int n=senate.length();

        Queue<Integer> radiant=new LinkedList<>();
        Queue<Integer> dire=new LinkedList<>();

        for(int i=0;i<n;i++){
            if(senate.charAt(i)=='D'){
                dire.add(i);
            }else{
                radiant.add(i);
            }
        }

        while(!radiant.isEmpty() && !dire.isEmpty()){
            int rPos=radiant.peek();
            int dPos=dire.peek();

            radiant.poll();
            dire.poll();

            if(rPos<dPos){
                //block D turn
                radiant.add(rPos+n);
            }else{
                //block R turn
                dire.add(dPos+n);
            }
        }
        return dire.isEmpty()?"Radiant":"Dire";
    }
}