class Solution {
    public int solution(int n) {
        int x =1;
        int cnt =0;
        if(n >= 3628800) return 10;
        while(true){
            if(n < x){
                cnt--;
                break;
            }else{
                cnt++;
                x= x*cnt;
            }
        }
        return cnt;
    }
}