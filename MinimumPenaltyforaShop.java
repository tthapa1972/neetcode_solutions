class MinimumPenaltyforaShop {
    public int bestClosingTime(String customers) {

        int n = customers.length();

        int []prefix = new int[n+1];
        int []postfix = new int[n+1];

        char []custArray = customers.toCharArray();

        for(int i = 1;i < n+1;i++){
            prefix[i] = prefix[i-1];
            if(custArray[i-1]=='N'){
                prefix[i]+=1;
            }
        }

        for(int i = n-1;i>=0;i--){
            postfix[i] = postfix[i+1];
            if(custArray[i]=='Y'){
                postfix[i] += 1;
            }
        }

        int min_penalty = Integer.MAX_VALUE;
        int idx = 0;

        for(int i = 0;i < n+1;i++){
            int penalty = prefix[i] + postfix[i];
            if(penalty < min_penalty){
                min_penalty = penalty;
                idx = i;
            }
        }
        
        return idx;
    }
}
