class BrickWall {
    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();

        int maxGap = 0;
        for(List<Integer> row : wall){
            int pos = 0;
            for(int i = 0;i < row.size() - 1;i++){
                pos += row.get(i);
                map.put(pos, 1+ map.getOrDefault(pos, 0));
                maxGap = Math.max(maxGap, map.get(pos));
            }
        }

        return wall.size() - maxGap;
    }
}
