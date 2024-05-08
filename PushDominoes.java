class PushDominoes {
    public String pushDominoes(String dominoes) {
        
        int N = dominoes.length();
        
        char []dominoesArray = dominoes.toCharArray();
        
        int []forces = new int[N];
        
        int force = 0;
        
        for(int i = 0;i < N;i++){
            
            if(dominoesArray[i] == 'R'){
                force = N;
            }else if(dominoesArray[i] == 'L'){
                force = 0;
            }else{
                force = Math.max(force - 1, 0);
            }
            
            forces[i] += force;
        }
        
        force = 0;
        
        for(int i = N-1;i >= 0;i--){
            
            if(dominoesArray[i] == 'L'){
                force = N;
            }else if(dominoesArray[i] == 'R'){
                force = 0;
            }else{
                force = Math.max(force - 1, 0);
            }
            
            forces[i] -= force;
        }
        
        StringBuffer sb = new StringBuffer();
        
        for(int f : forces){
            if(f > 0){
                sb.append('R');
            }else if(f < 0){
                sb.append('L');
            }else{
                sb.append('.');
            }
        }
        
        return sb.toString();
    }
}
