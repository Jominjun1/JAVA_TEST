class Solution {
    boolean[] visit;
    int[][] computers;
    int n;
    public void dfs(int node){
        visit[node] = true;
        for(int i=0; i<n; i++){
            if(computers[node][i] == 1 && !visit[i]){
                dfs(i);
            }
        }
    }
    public int solution(int n, int[][] computers) {
        this.n = n;
        this.computers = computers;
        visit = new boolean[n];
        
        int answer = 0;
        for(int i=0; i<n; i++){
            if(!visit[i]){
                dfs(i);
                answer++;
            }
        }
        return answer;
    }
}