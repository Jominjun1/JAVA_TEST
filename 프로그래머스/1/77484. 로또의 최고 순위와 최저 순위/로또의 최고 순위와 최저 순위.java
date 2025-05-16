import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int left =0;
        int right =0;
        for(int i=0; i<win_nums.length; i++){
            if(lottos[i] == 0){
                    left++;
            }
            for(int j=0; j<lottos.length; j++){
                if(lottos[j] == win_nums[i]){
                    right++;
                }
            }
        }
        if(right == 0){
            right++;
        }
        
        if(left == 6){
            answer[0] = 1;
        }else{
            answer[0] = 7 - (left + right);
        }
        answer[1] = 7 - right;
        
        return answer;
    }
}