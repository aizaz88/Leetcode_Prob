class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int[] sorted=Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);
        
        Map<Integer,Integer> rank=new HashMap<>();
        int val=1;
        for(int num:sorted){
            if(!rank.containsKey(num)){
                rank.put(num,val++);
            }
        }
        int[] result=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=rank.get(arr[i]);
        }
        return result;
    }
}