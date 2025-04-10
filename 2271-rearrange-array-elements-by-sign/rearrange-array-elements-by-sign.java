class Solution {
    public int[] rearrangeArray(int[] nums) {

            int[] res=new int[nums.length];
            int posIdx=0;int negIdx=1;
            for(int n:nums){
                if(n>0){
                    res[posIdx]=n;
                    posIdx+=2;
                }else{
                    res[negIdx]=n;
                    negIdx+=2;
                }
            }

            return res;
    }
} 


        /*List<Integer> negative=new ArrayList<>();
        List<Integer> positive=new ArrayList<>();

    for(int i=0;i<nums.length;i++){
        if(nums[i]<0){
            negative.add(nums[i]);
        }else{
            positive.add(nums[i]);
        }
    }

        List<Integer> list=new ArrayList<>();
        for(int i=0;i<negative.size();i++){
            list.add(positive.get(i));
            list.add(negative.get(i));
        }

    int[] res=new int[nums.length];
    int i=0;
        for(int num:list) res[i++]=num;

        return res;
    }
} */