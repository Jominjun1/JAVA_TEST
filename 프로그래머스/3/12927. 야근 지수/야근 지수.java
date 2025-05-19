import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : works){
            pq.offer(i);
        }
        while(n >0 && !pq.isEmpty()){
            int max = pq.poll();
            if(max > 0){
                pq.offer(max-1);
                n--;
            }
        }
        while(!pq.isEmpty()){
            int x = pq.poll();
            answer += x*x;
        }
        return answer;
    }
}