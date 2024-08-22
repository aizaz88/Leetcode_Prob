class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n=temperatures.length;
        int[] result=new int[n];
        
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index=stack.pop();
                result[index]=i-index;
            }
            stack.push(i);
        }
        return result;
      }
    }
        
        
        
        
       // int[] result=new int[temperatures.length];
        //for(int i=0;i<temperatures.length-1;i++){
          //  int counter=0;
            //for(int j=i+1;j<temperatures.length;j++){
              //  counter++;
                //if(temperatures[i]<temperatures[j]){
                  //  result[i]=counter;
                    //break;
                //}
            //} 
        //}
        //return result;