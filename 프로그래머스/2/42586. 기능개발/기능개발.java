import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        if(progresses.length == 1){
            return new int[]{1};
        }
        for(int i=0; i<progresses.length; i++){
            progresses[i] = (int)Math.ceil((100.0 - progresses[i]) / speeds[i]);
        }
        int x = progresses[0];
        int cnt =0;
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<progresses.length; i++){
            if(x >= progresses[i]){
                cnt++;
            }else if(x < progresses[i]){
                x = progresses[i];
                list.add(cnt);
                cnt=1;
            }
        }
        list.add(cnt);
        int[] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}