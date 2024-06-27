class ReconstructFlightPath {
    public List<String> findItinerary(List<List<String>> tickets) {
        LinkedList<String> itinerary = new LinkedList<>();

        Map<String, PriorityQueue<String>> graph = new HashMap<>();

        for(List<String> ticket : tickets){
            graph.computeIfAbsent(ticket.get(0), k -> new PriorityQueue<>()).add(ticket.get(1));
        }

        Stack<String> stack = new Stack<>();

        stack.push("JFK");

        while(!stack.isEmpty()){
            if(!graph.getOrDefault(stack.peek(), new PriorityQueue()).isEmpty()){
                stack.push(graph.get(stack.peek()).poll());
            }else{
                itinerary.addFirst(stack.pop());
            }
        }

        return itinerary;

    }
}
