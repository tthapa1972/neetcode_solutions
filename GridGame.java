class GridGame {
    public long gridGame(int[][] grid) {
        int n = grid[0].length;

        long []pre1 = new long[n];
        long []pre2 = new long[n];

        for(int i = 0;i < n;i++){
            pre1[i] = grid[0][i];
            pre2[i] = grid[1][i];
        }

        for(int i = 1;i < n;i++){
            pre1[i]+=pre1[i-1];
            pre2[i]+=pre2[i-1];
        }

        long res = Long.MAX_VALUE;
        long second = Long.MIN_VALUE;
        for(int i = 0;i < n;i++){
            long top = pre1[n-1] - pre1[i];
            long bottom = 0;
            if(i > 0){
                bottom = pre2[i-1];
            }
            second = Math.max(top,bottom);
            res = Math.min(res,second);
        }

        return res;
    }
}
