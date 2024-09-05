class Solution {
    public String convertToBase7(int num) {
        //case 1
        if(num==0){
            return "0";
        }
        
        StringBuilder base_7=new StringBuilder();
        boolean isNegative=num<0;
        num=Math.abs(num);
        
        while(num>0){
            
            int reminder=num%7;
            base_7.append(reminder);
            num=num/7;  
            
        }
        
        if(isNegative){
                    base_7.append("-");
                }
        
        return base_7.reverse().toString();
    }
}