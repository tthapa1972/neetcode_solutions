class PathWithMinimumEffort {
    public int minimumEffortPath(int[][] heights) {
       int ROW = heights.length;
       int COL = heights[0].length;

       PriorityQueue<Node> queue = new PriorityQueue<>((a,b) -> Integer.compare(a.diff, b.diff)); 

       queue.offer(new Node(0, 0, 0));

       boolean [][]visited = new boolean[ROW][COL]; 
       
       int [][]delta = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; 

       while(!queue.isEmpty()){
        Node node = queue.poll();
        if(visited[node.x][node.y]){
            continue;
        }

        if(node.x == (ROW - 1) && node.y == (COL - 1)){
            return node.diff;
        }

        visited[node.x][node.y] = true;
        for(int []del: delta ){
            int newX = node.x + del[0];
            int newY = node.y + del[1];
            if(newX < 0 || newY < 0 || newX == ROW || newY == COL || visited[newX][newY]){
                continue;
            }

            int newDiff = Math.max(node.diff, Math.abs(heights[node.x][node.y] - heights[newX][newY]));
            queue.offer(new Node(newDiff, newX, newY));
        }

       }

       return -1;
    }


}

class Node{
    int diff;
    int x;
    int y;
    public Node(int diff, int x, int y){
        this.diff = diff;
        this.x = x;
        this.y = y;
    }
}
