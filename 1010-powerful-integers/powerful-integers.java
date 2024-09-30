class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        
        Set<Integer> result=new HashSet<>();
        int i=0;
        while(Math.pow(x,i)<=bound){
            int j=0;
            while(Math.pow(x,i)+Math.pow(y,j)<=bound){
                result.add((int)(Math.pow(x,i)+Math.pow(y,j)));
                if(y==1) break;
                j++;
            }
            if(x==1) break;
            i++;
        }
        return new ArrayList<>(result);
    }
}