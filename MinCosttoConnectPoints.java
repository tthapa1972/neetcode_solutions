class MinCosttoConnectPoints {
    public int minCostConnectPoints(int[][] points) {
        PriorityQueue<int[]> pQueue = new PriorityQueue<>((a,b) -> Integer.compare(a[0], b[0]));

        Set<Integer> visited = new HashSet<>();

        int N = points.length;

        pQueue.offer(new int[]{0, 0});

        int totalCost =  0;

        while(visited.size() < N){

            int []temp = pQueue.poll();

            int cost = temp[0];
            int node = temp[1];

            if(visited.contains(node)){
                continue;
            }

            visited.add(node);
            totalCost += cost;

            for(int nextNode = 0;nextNode < N;nextNode++){
                if(!visited.contains(nextNode)){
                    int newCost = Math.abs(points[nextNode][0] - points[node][0]) + Math.abs(points[nextNode][1] - points[node][1]);
                    pQueue.offer(new int[]{newCost, nextNode});
                }
            }


        }

        return totalCost;
    }
}
