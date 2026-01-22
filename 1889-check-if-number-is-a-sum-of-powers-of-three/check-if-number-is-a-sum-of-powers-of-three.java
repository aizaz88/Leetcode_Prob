class Solution {
    public boolean checkPowersOfThree(int n) {
        //Base 3 rules...(n%3==(not in 0's and 1's)->false)
        while(n>0){
            if(n%3==2){
                return false;
            }
           n= n/3;
        }
        return true;
    }
}