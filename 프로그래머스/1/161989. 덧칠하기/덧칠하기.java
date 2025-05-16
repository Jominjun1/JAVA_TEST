class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
         if(m == 1){
            answer = section.length;
            return answer;
        }
        int x =0;
        for(int i=0; i<section.length; i++){
            if(section[section.length-1] < x){
                break;
            }else if(section[i] < x){
                continue;
            }else{
                x = section[i];
                answer++;
                x += m;
            }
        }
        return answer;
    }
}