class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;

        int prefix = 1;

        int []result = new int[n];
        for(int i = 0;i < n;i++){
            result[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;

        for(int i = (n-1);i>=0;i--){
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }
}
