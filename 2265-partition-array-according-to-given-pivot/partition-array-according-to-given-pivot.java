class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        List<Integer> lessPivot=new ArrayList<>();
        List<Integer> equalPivot=new ArrayList<>();
        List<Integer> greaterPivot=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot){
                lessPivot.add(nums[i]);
            }else if(nums[i]==pivot){
                equalPivot.add(nums[i]);
            }else{
                greaterPivot.add(nums[i]);
            }
        }

        int[] res=new int[nums.length];
        int i=0;
        for(int num:lessPivot) res[i++]=num;
        for(int num:equalPivot) res[i++]=num; 
        for(int num:greaterPivot) res[i++]=num; 
        
    return res;
    }
}