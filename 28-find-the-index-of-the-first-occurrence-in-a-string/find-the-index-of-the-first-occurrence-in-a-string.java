class Solution {
    public int strStr(String haystack, String needle) {
       //Two pointers 

    int n=haystack.length();
    int m=needle.length();
    if(m==0) return 0;

    for(int i=0;i<=n-m;i++){
        int j=0;

        while(j<m && haystack.charAt(i+j)==needle.charAt(j)){
            j++;
        }

        if(j==m){
            return i;
        }
    }

    return -1;
    }
}

/*
 
        if (needle.isEmpty()) {
            return 0;
        }
        
        for(int i=0;i<haystack.length()-needle.length()+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
*/