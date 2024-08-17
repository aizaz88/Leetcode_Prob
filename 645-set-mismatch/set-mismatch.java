class Solution {
    public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int dupli=-1;
        int missing=-1;
        
       Set<Integer> set=new HashSet<>();
        int sum=0;
        for(int num:nums){
            if(set.contains(num)){
                dupli=num;
            }
            set.add(num);
            sum+=num;
        }
        
        int expectedsum=n*(n+1)/2;
         missing=expectedsum-(sum-dupli);
        
        return new int[]{dupli,missing};
    }
}