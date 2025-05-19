class Solution {
    public int solution(int n) {
        boolean [] bool = new boolean[n+1];
        int answer=0;
        bool[0]=true;
        bool[1]=true;
        for(int i=2; i*i<=n; i++){
            if(bool[i]) continue;
            for(int j=2; i*j<=n; j++){
                bool[i*j] = true;
            }
        }
        for(int i=0; i<bool.length; i++){
            if(bool[i] == false) answer++;
        }
        return answer;
    }
}