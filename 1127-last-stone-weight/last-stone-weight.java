class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());

        for(int s:stones){
            maxHeap.offer(s);
        }

        while(maxHeap.size()>1){
            int x=maxHeap.poll();
            int y=maxHeap.poll();

            if(x!=y){
                maxHeap.offer(x-y);
            }

        }
        return maxHeap.isEmpty()? 0:maxHeap.peek();
    }
}