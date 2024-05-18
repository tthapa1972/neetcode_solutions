class SimplifyPath {
    public String simplifyPath(String path) {
        String newPath = path+"/";
        StringBuilder curr = new StringBuilder("");

        Stack<String> stack = new Stack<>();
        for(int i = 0; i < newPath.length();i++){
            char ch = newPath.charAt(i);
            if(ch == '/'){
                if(curr.toString().equals("..")){
                    if(!stack.isEmpty())
                        stack.pop();
                }else if(!curr.isEmpty() && !curr.toString().equals(".")){
                    stack.push(curr.toString());
                }
                curr = new StringBuilder();
            }else{
                curr.append(ch);
            }
        }

        curr = new StringBuilder();

        while(!stack.isEmpty()){
            curr.insert(0, "/"+stack.pop());
        }

        if(curr.length() == 0){
            curr.append("/");
        }

        return curr.toString();
    }
}
