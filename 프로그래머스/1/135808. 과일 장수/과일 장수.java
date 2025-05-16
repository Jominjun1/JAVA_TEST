import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int x=score.length;
        Arrays.sort(score);
        while(true){
            if(x-m < 0) break;
            answer += score[x-m] * m;
            x-=m;
        }
        return answer;
    }
}