class IslandsAndTreasure {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();

        int row = grid.length;
        int col = grid[0].length;

        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                if(grid[i][j] == 0){
                    queue.add(new int[]{i,j});
                }
            }
        }

        if(queue.isEmpty()){
            return;
        }

        int steps[][] = {{1,0}, {-1, 0}, {0,1}, {0,-1}};

        while(!queue.isEmpty()){
            int []temp = queue.poll();
            int r = temp[0];
            int c = temp[1];
            for(int i = 0;i < 4;i++){
                int nextR = r + steps[i][0];
                int nextC = c + steps[i][1];
                if(nextR < 0 || nextR >= row || nextC < 0 || nextC >= col || grid[nextR][nextC] != 2147483647){
                    continue;
                }
                queue.add(new int[]{nextR, nextC});

                grid[nextR][nextC] = grid[r][c] +  1;
            }
        }

    }
}
