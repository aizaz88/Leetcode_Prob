class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int encrypted=EncryptNum(num);
            sum+=encrypted;
        }
        return sum;
    }
    
    private int EncryptNum(int number){
        String str=Integer.toString(number);
        char maxdigit='0';
        for(char digit:str.toCharArray()){
            if(digit>maxdigit){
                maxdigit=digit;
            }
        }

        StringBuilder encryptStr=new StringBuilder();
        for(int i=0;i<str.length();i++){
            encryptStr.append(maxdigit);
        }

       return  Integer.parseInt(encryptStr.toString());
    }
}