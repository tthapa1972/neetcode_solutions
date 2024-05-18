class RemoveAllAdjacentDuplicatesinStringII {
    public String removeDuplicates(String s, int k) {
        Stack<Node> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(!stack.isEmpty() && stack.peek().ch == c){
                stack.peek().count++;
            }else{
                stack.push(new Node(c, 1));
            }

            if(stack.peek().count == k){
                stack.pop();
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!stack.isEmpty()){
            Node node = stack.pop();
            for(int i = 0;i < node.count;i++)
                sb.append(node.ch);
        }

        return sb.reverse().toString();
    }
}

class Node{
    char ch;
    int count;

    public Node(char ch, int count){
        this.ch = ch;
        this.count = count;
    }
}
