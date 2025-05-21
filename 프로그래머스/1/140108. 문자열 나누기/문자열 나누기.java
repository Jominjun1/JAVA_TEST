class Solution {
    public int solution(String s) {
    int answer = 0, x = 0, y = 0;
    char target = s.charAt(0);
    for(int i=0; i<s.length(); i++){
        if(s.charAt(i) == target) x++;
        else y++;

        if(x==y){
            answer++;
            if(i+1<s.length()){
                target=s.charAt(i+1);
            }
            x=0;
            y=0;
        }
    }
    if(x!=0||y!=0) answer++;
    return answer;
    }
}