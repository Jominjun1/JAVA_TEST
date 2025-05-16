class Solution {
    public int solution(int[][] sizes) {
        int size1 = 0;
        int size2 = 0;
        for(int i = 0; i < sizes.length; i++){
            int maxSize = Math.max(sizes[i][0], sizes[i][1]);
            if(size1 < maxSize){
                size1 = maxSize;
            }
            int minSize = Math.min(sizes[i][0], sizes[i][1]);
            if(size2 < minSize){
                size2 = minSize;
            }
        }
        return  size1 * size2;
    }
}