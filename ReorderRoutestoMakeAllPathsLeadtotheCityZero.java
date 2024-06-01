class ReorderRoutestoMakeAllPathsLeadtotheCityZero {
    int res = 0;
    Map<Integer, List<Integer>> graph = new HashMap<>();
    Set<String> oldEdges = new HashSet<>();

    public int minReorder(int n, int[][] connections) {

        Set<Integer> visited = new HashSet<>();

        for(int []edge : connections){
            int a = edge[0];
            int b = edge[1];
            String s = a + "->" + b;
            oldEdges.add(s);
            graph.computeIfAbsent(a, value -> new ArrayList<>()).add(b);
            graph.computeIfAbsent(b, value -> new ArrayList<>()).add(a);
        }



        dfs(0, -1, visited);
        return res  - 1;

    }

    public void dfs(int cur, int parent, Set<Integer> visited){
        if(visited.contains(cur)){
            return;
        }
        String s = cur + "->"+parent;
        visited.add(cur);
        if(!oldEdges.contains(s)){
            res++;
        }
        for(int child : graph.get(cur)){
            dfs(child, cur, visited);
        }
    }
}
