import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            pq.offer(scoville[i]);
        }
        while(true){
            if(pq.peek() >= K) break;
            if(pq.size() == 1) return -1;
            
            int x= pq.poll();
            int y= pq.poll();
            pq.offer(x+(y*2));
            answer++;
        }
        return answer;
    }
}