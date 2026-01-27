class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        int[] res=new int[]{-1,-1};
        int quality=Integer.MIN_VALUE;

        for(int i=0;i<towers.length;i++){
            int x=towers[i][0];
            int y=towers[i][1];
            int q=towers[i][2];

            int dis=Math.abs(x-center[0])+Math.abs(y-center[1]);

            if(dis<=radius){
                if(q>quality){
                    quality=q;
                    res=new int[]{x,y};

                }else if(q==quality){
                    if(res[0]==-1 || x<res[0] || (x==res[0] && y<res[1])){
                        res=new int[]{x,y};
                    }
                }
            }
        }
        return res;
    }
}