class NumberofPairsofInterchangeableRectangles {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double, Long> map = new HashMap<>();

        for(int []arr : rectangles){
            double ratio = (double)arr[0]/arr[1];
            map.put(ratio, 1+ map.getOrDefault(ratio,(long)0));
        }

        long  res = 0;

        for(long value : map.values()){

            if(value >= 2){
                res +=  ((value * (value - 1))/2);
            }
        }

        return res;
    }
}
