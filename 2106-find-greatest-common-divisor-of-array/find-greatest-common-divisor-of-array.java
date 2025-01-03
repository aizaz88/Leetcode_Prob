class Solution {
    public int findGCD(int[] nums) {
        int max=maxNum(nums);
        int min=minNum(nums);
        return gcd(min,max);
    }

    private int gcd(int a,int b){
        int gcd=1;
        for(int i=a;i>0;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;
    }

    private int maxNum(int[] nums){
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        return max;
    }
    private int minNum(int[] nums){
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
}