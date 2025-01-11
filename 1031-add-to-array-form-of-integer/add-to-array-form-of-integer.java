import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder strnum=new StringBuilder();
        
        for(int n:num){
            strnum.append(n);
        }
        
        BigInteger bigint=new BigInteger(strnum.toString());
        bigint=bigint.add(BigInteger.valueOf(k));
        
        String strresult=bigint.toString();

        List<Integer> output=new ArrayList<>();
        for(char ch:strresult.toCharArray()){
            output.add(ch-'0');
        }
        
        return output;
    }
}