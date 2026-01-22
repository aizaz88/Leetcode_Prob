class Solution {
    public boolean isFascinating(int n) {
        String s1= String.valueOf(n);
        String s2= String.valueOf(2*n);
        String s3= String.valueOf(3*n);

        StringBuilder sb=new StringBuilder();
        sb.append(s1).append(s2).append(s3);

        int[] occ=new int[10];
        for(char ch:sb.toString().toCharArray()){
            if(ch=='0'){
                return false;
            }else{
                occ[ch-48]++;
                if(occ[ch-48]>1){
                    return false;
                }
            }
        }
            return true;
    }
}