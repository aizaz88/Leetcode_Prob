class Solution {
    public int thirdMax(int[] nums) {

       Set<Integer> set=new HashSet<>();
       for(int n:nums){
        set.add(n);
       }

        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(set);

            if(maxHeap.size()<3){
                return maxHeap.peek();
            }

       maxHeap.poll();
       maxHeap.poll();
       
       return maxHeap.poll();

    }
}