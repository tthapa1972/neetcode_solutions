class LargestNumber {
    public String largestNumber(int[] nums) {
        int n = nums.length;

        String []numsStr = new String[n];

        for(int i=0;i<n;i++){
            numsStr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(numsStr, 0, n, (a,b) -> {
            String n1 = a + b, n2 = b+a;
            return n2.compareTo(n1);
        });

        if(numsStr[0].equals("0"))return "0";

        StringBuilder sb = new StringBuilder("");

        for(String s : numsStr){
            sb.append(String.valueOf(Integer.valueOf(s)));
        }

        return sb.toString();
    }
}
