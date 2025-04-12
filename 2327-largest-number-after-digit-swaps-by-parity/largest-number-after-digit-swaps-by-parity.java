class Solution {
    public int largestInteger(int num) {
        List<Integer> even=new ArrayList<>();
        List<Integer> odd=new ArrayList<>();

        char[] digit=String.valueOf(num).toCharArray();
        for(char c:digit){
            int d=c-'0';
            if(d%2==0){
                even.add(d);
            }else{
                odd.add(d);
            }
        }

        Collections.sort(even,Collections.reverseOrder());
        Collections.sort(odd,Collections.reverseOrder());

        StringBuilder res=new StringBuilder();
        int evenIdx=0,oddIdx=0;
        for(char c:digit){
            int d=c-'0';
            if(d%2==0){
                res.append(even.get(evenIdx++));
            }else{
                res.append(odd.get(oddIdx++));
            }
        }

        return Integer.parseInt(res.toString());
    }
}