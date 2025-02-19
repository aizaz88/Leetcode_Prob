class Solution {
    public int[] separateDigits(int[] nums) {
        
        ArrayList<Integer> numbers=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            Stack<Integer> st=new Stack<>();
            int number=nums[i];

        while(number>0){
            st.push(number%10);
            number=number/10;
          }

          while(!st.isEmpty()){
            numbers.add(st.pop());
          }
        }

        int[] result=new int[numbers.size()];
        for(int i=0;i<numbers.size();i++){
            result[i]=numbers.get(i);
        }
        return result;
    }

}