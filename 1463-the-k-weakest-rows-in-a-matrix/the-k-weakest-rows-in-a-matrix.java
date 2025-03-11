class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
     int[][] rowSoldier=new int[mat.length][2];

        for(int i=0;i<mat.length;i++){
            int soldier=0;
            for(int val:mat[i]){
                soldier+=val;
            }
            rowSoldier[i][0]=soldier;
            rowSoldier[i][1]=i;
        }

        Arrays.sort(rowSoldier,(a,b)-> a[0]==b[0] ? a[1]-b[1] : a[0]-b[0]);

        int[] result=new int[k];
        for(int i=0;i<k;i++){
            result[i]=rowSoldier[i][1];
        }
        
        return result;
    }
}