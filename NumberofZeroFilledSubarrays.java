class NumberofZeroFilledSubarrays {
    public long zeroFilledSubarray(int[] nums) {

        long n = nums.length;

        long res = 0;
        int i = 0;

        while(i < n){
            int count = 0;
            while(i < n && nums[i] == 0){
                count+=1;
                i+=1;
                res += count;
            }
            i+=1;
        }

        return res;
    }
}
