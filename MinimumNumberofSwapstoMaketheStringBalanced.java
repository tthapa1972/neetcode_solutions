class MinimumNumberofSwapstoMaketheStringBalanced {
    public int minSwaps(String s) {
        int close = 0;
        int maxClose = 0;

        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(ch == '['){
                close -= 1;
            }else{
                close += 1;
            }
            maxClose = Math.max(close, maxClose);
        }   

        return ((maxClose + 1)/2);
    }
}
