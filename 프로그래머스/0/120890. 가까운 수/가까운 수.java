import java.util.*;
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int min = Math.abs(array[0]-n);
        
        for(int i=1; i<array.length; i++){
            int x = Math.abs(array[i]-n);
            if(x < min || (x ==min && array[i] < answer)){
                min = x;
                answer = array[i];
            }
        }
        return answer;
    }
}