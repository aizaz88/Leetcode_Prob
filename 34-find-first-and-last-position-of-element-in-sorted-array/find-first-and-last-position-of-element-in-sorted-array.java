class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        List<Integer> list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                list.add(i);
            }
        }
      
        if(list.size()==0){
            return new int[]{-1,-1};
        }
        
        int[] result=new int[2];
        result[0]=list.get(0);
        result[1]=list.get(list.size()-1);
        
        return result;
    }
}

/*
  int start=0,end=nums.length;
        while(start<=end){
            int mid=(start+end)/2;
            if(nums[mid]>target){
                end=mid-1;
            }else if(nums[mid]<target){
                start=mid+1;
            }else{
                list.add(mid);
            }
        }
*/