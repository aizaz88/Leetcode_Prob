class Solution {
    public String multiply(String num1, String num2) {
      
        int m=num1.length();
        int n=num2.length();
        int[] result=new int[m+n];
        
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                int multi=(num1.charAt(i)-'0')*(num2.charAt(j)-'0');
                int sum=multi+result[i+j+1];
                
            result[i + j] += sum / 10;
                result[i + j + 1] = sum % 10;
            }
        }
            StringBuilder answer=new StringBuilder();
        for(int number:result){
            if(!(answer.length()==0 && number==0)){
                answer.append(number);
            }
        }
        
        return answer.length()==0 ? "0":answer.toString();
    }
}