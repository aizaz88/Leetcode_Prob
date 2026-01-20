class Solution {
    public String addStrings(String num1, String num2) {
        
        int carry=0;
        int len1=num1.length();
        int len2=num2.length();

        StringBuilder res=new StringBuilder();

        while(len1>0 || len2>0 || carry!=0){
            int sum=carry;
            if(len1>0){
                sum+=num1.charAt(len1-1)-'0';
                len1--;
            }
             if(len2>0){
                sum+=num2.charAt(len2-1)-'0';
                len2--;
            }
            carry=sum/10;
            res.append(sum%10);
        }
        return res.reverse().toString();
    }
}