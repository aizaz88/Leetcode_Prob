class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        double avg=0;
        for(int i=1;i<=salary.length-2;i++){
             avg=avg+salary[i];
        }
        avg=avg/(salary.length-2);
        return avg;
        }
}