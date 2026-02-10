class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n=deck.length;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<n;i++){
            q.add(i);
        }

        Arrays.sort(deck);
        int[] ans=new int[n];

        for(int i=0;i<n;i++){
            ans[q.poll()]=deck[i];

            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }
        return ans;
    }
}