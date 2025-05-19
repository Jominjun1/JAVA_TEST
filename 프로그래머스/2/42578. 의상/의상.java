import java.util.*;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String , Integer> map = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            map.merge(clothes[i][1] , 1 , Integer::sum);
        }
        List<Integer> list = new ArrayList<>(map.values());
        for (int i = 0; i < list.size(); i++) {
            answer *= list.get(i) + 1;
        }
        return answer -1;
    }
}