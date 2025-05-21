import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        for(int i=0; i<operations.length; i++){
            String [] str = operations[i].split(" ");
            if(str[0].equals("I")){
                pq.offer(Integer.parseInt(str[1]));   
            }else if(operations[i].equals("D -1")){
                if(pq.isEmpty()) continue;
                pq.poll();
            }else {
                if(pq.isEmpty()) continue;
                int x = Collections.max(pq);
                pq.remove(x);
            }
        }
        if(pq.isEmpty()){
            answer[1] = 0;
            answer[0] =0;
        } else{
            int x = Collections.max(pq);
            answer[1] = pq.remove();
            answer[0] = x;
        }
        return answer;
    }
}