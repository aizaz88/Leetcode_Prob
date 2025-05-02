class Solution {
    public int divisorSubstrings(int num, int k) {
        
       String numStr=String.valueOf(num);
       int count=0;

       for(int i=0;i<=numStr.length()-k;i++){
            String subNum=numStr.substring(i,i+k);
            int value=Integer.parseInt(subNum);

            if(value!=0 && num%value==0){
                count++;
            }
       }

       return count;
    }
}