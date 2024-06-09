class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1=new HashSet<>();
        Set<Integer> set2=new HashSet<>();
        
       for(int n:nums1){
           set1.add(n);
       }
        
        for(int n:nums2){
            set2.add(n);
        }
        List<Integer> dif1=new ArrayList<>(set1);
        List<Integer> dif2=new ArrayList<>(set2);
        dif1.removeAll(set2);
        dif2.removeAll(set1);
        
        List<List<Integer>> result=new ArrayList<>();
        result.add(dif1);
        result.add(dif2);
        
        return result;
        
    }
}