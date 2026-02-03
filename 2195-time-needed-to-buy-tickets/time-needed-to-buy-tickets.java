class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }

        int seconds=0;
        while(!q.isEmpty()){
             seconds++;
            int candidate=q.poll();

            if(tickets[candidate]>=1){
               tickets[candidate]--;
            }

            if(candidate==k && tickets[candidate]==0){
                break;
            }

            if(candidate!=k && tickets[candidate]==0){
                continue;
            }
            q.add(candidate);
        }
        return seconds;
    }
}