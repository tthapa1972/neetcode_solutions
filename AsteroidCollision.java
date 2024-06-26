class AsteroidCollision {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        int n = asteroids.length;

        int index = 0;

        while(index < n){
            int a = asteroids[index];
            if(stack.isEmpty()){
                stack.push(a);
                index++;
            }else{
                if(stack.peek() > 0 & a < 0){
                    if(Math.abs(stack.peek()) > Math.abs(a)){
                        index++;
                    }else if(Math.abs(stack.peek()) < Math.abs(a)){
                        stack.pop();
                    }else{
                        index++;
                        stack.pop();
                    }
                }else{
                    stack.push(a);
                    index++;
                }
            }
        }


        int []res = new int[stack.size()];

        int i = res.length - 1;
        while(i>=0){
            res[i--] = stack.pop();
        }

        return res;
    }
}
