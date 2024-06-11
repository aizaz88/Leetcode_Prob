class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        
        for(int n: nums1){
            set1.add(n);
        }
        
        for(int n: nums2){
            if(set1.contains(n)){
                set2.add(n);
            }
        }
        
        List<Integer> list=new ArrayList<>(set2);
        Collections.sort(list);
        for(int n: list){
           if(set1.contains(n)){
               return n;
           }
        }
        return -1;
    }
}