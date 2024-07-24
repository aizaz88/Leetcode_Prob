class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
       
        
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        Set<Integer> s3=new HashSet<>();
        Set<Integer> result=new HashSet<>();
        
        for(int n:nums1){
            s1.add(n);
        }
        
        for(int n:nums2){
            s2.add(n);
            if(s1.contains(n)){
                result.add(n);
            }
        }
        for(int n:nums3){
            s3.add(n);
            if(s1.contains(n) || s2.contains(n)){
                result.add(n);
            }
        }
        
         List<Integer> list=new ArrayList<>(result);
        return list;
    }
}