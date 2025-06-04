class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left=0;
        int right=arr.length-k;

        while(left<right){
            int mid=(left+right)/2;
            if(x-arr[mid]>arr[mid+k]-x){
                left=mid+1;
            }else{
                right=mid;
            }
        }

        List<Integer> res=new ArrayList<>();
        for(int i=left;i<left+k;i++){
            res.add(arr[i]);
        }
        return res;
    }
}

/*
PriorityQueue<int[]> minHeap=new PriorityQueue<>(
            (a,b)->{
                int diffA=Math.abs(a[0]-x);
                int diffB=Math.abs(b[0]-x);
                if(diffA==diffB){
                    return a[0]-b[0];
                }
                return diffA-diffB;
            }
        );
        
        for(int num:arr){
            minHeap.add(new int[]{num});
        }

        List<Integer> result=new ArrayList<>();
        while(k>0 && !minHeap.isEmpty()){
            result.add(minHeap.poll()[0]);
            k--;
        }

        Collections.sort(result);

        return result;
*/ 