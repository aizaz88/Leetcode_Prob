
class Solution {
    public int leastInterval(char[] tasks, int n) {
  
      int[] count=new int[26];
        for(int i=0;i<tasks.length;i++){
            count[tasks[i]-'A']++;
        }
        
        Arrays.sort(count);
        int max_freq=count[25];
        int idleslot=(max_freq-1)*n;
        
        for(int i=24;i>=0;i--){
            idleslot-=Math.min(max_freq-1,count[i]);
        }

        idleslot = Math.max(0, idleslot);
        
        return tasks.length + idleslot;
    }
}
