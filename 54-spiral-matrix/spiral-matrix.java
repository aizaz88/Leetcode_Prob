class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;

        int RowS=0,RowE=rows-1;
        int ColS=0,ColE=cols-1;

        while(RowS<=RowE && ColS<=ColE){

             for(int i=ColS;i<=ColE;i++){
            list.add(matrix[RowS][i]);
                 }
        RowS++;

        for(int i=RowS;i<=RowE;i++){
            list.add(matrix[i][ColE]);
        }
        ColE--;

            if(RowS<=RowE){
                for(int i=ColE;i>=ColS;i--){
            list.add(matrix[RowE][i]);
             }
             RowE--;
            }

       if(ColS<=ColE){
         for(int i=RowE;i>=RowS;i--){
            list.add(matrix[i][ColS]);
             }
        ColS++;
       }


        }
        return list;
    }
}