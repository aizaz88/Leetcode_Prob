class ProductOfNumbers {

      private List<Integer> array;

    public ProductOfNumbers() {
        array=new ArrayList<>();
    }
    
    public void add(int num) {
        array.add(num);
    }
    
    public int getProduct(int k) {
        int product=1;
        int listSize=array.size();
        for(int i=listSize-k;i<listSize;i++){
            product*=array.get(i);
        }
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */