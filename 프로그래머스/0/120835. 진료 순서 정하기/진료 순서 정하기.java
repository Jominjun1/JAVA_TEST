import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = emergency.clone();
        Arrays.sort(sorted); 
        
        Map<Integer , Integer> map = new HashMap<>();
        int[] answer = new int[emergency.length];
        for(int i=0; i<answer.length; i++){
            map.put(sorted[i], sorted.length - i);
        }
        for(int i=0; i<emergency.length; i++){
            answer[i] = map.get(emergency[i]);
        }
        return answer;
    }
}