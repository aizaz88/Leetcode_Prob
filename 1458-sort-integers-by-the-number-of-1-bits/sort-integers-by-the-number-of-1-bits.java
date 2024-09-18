class Solution {
    public static int countBits(int n) {
        return Integer.bitCount(n);
    }

    public static int[] sortByBits(int[] arr) {
        
        Integer[] boxedArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);

        Map<Integer,Integer> bitCountMap=new HashMap<>();
        for(int num:arr){
            bitCountMap.put(num,countBits(num));
        }
        
        Arrays.sort(boxedArr,(a,b)->{
            int countA=bitCountMap.get(a);
            int countB=bitCountMap.get(b);

            if(countA==countB){
                return Integer.compare(a,b);
            }
            return Integer.compare(countA,countB);
        });
        
     return Arrays.stream(boxedArr).mapToInt(Integer::intValue).toArray();
    }
}