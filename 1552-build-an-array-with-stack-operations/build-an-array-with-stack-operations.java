class Solution {
    public List<String> buildArray(int[] target, int n) {
        
        List<String> result=new ArrayList<>();
   
        int stream=1;
        int i=0;
        while(i<target.length && stream<=n){
            result.add("Push");
            if(stream==target[i]){
                i++;
            }else{
                result.add("Pop");
            }
            stream++;
        }
        return result;
    }
}