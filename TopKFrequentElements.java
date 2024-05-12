class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((e1, e2) -> 
            e1.getValue() - e2.getValue());

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            pq.add(e);
            if(pq.size()> k){
                pq.poll();
            }
        }

        int []result = new int[k];

        int i = k;

        while(!pq.isEmpty()){
            result[--i] = pq.poll().getKey();
        }

        return result;
    }
}
