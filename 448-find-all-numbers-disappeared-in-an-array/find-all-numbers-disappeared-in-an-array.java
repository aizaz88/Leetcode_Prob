class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> lis=new ArrayList<>();
        
        Set<Integer> set=new HashSet<>();
    for(int n: nums){
        set.add(n);
    }
        int n=nums.length;
        for(int i=1;i<=n;i++){
            if(!set.contains(i)){
                lis.add(i);
            }
        }
        return lis;
    }
}