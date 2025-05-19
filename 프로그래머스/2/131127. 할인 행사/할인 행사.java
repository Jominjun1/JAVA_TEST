import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer=0;
        HashMap<String , Integer> map1 = new HashMap<>();
        for(int i=0; i<want.length; i++){
            map1.put(want[i] , number[i]);
        }
        int cnt=0;
        while(cnt <= discount.length-10){
            HashMap<String , Integer> map2 = new HashMap<>();
            for(int i=0; i<10; i++){
                map2.put(discount[i+cnt] , map2.getOrDefault(discount[i+cnt] , 0)+1);
            }
            if(map1.equals(map2)) {
                answer++;
            }
            cnt++;
        }
        return answer;
    }
}