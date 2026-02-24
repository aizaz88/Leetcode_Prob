class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
            backTrack(nums,0,curr,res);
            return res;
    }

    private void backTrack(int[] nums,int index,List<Integer> curr,List<List<Integer>> res){
            if(index==nums.length){
                res.add(new ArrayList<>(curr));
                return;
            }

                //Add -include to the list
            curr.add(nums[index]);
            backTrack(nums,index+1,curr,res);
                //Remove-----
            curr.remove(curr.size()-1);
            backTrack(nums,index+1,curr,res);
    }

}