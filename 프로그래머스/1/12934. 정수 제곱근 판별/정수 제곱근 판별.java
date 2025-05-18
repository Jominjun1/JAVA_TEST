class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long i = 1; i * i <= n; i++) {  
            if (n == i * i) {
                return (i + 1) * (i + 1);  
            }
        }
        return -1;  
    }
}
