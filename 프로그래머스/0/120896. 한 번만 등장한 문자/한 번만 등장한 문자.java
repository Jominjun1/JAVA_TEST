import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        HashMap<Character , Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.merge(ch, 1, Integer::sum);
        }
        List<Character> list = new ArrayList<>();
        for(char ch : map.keySet()){
            if(map.get(ch)==1){
                list.add(ch);
            }
        }
        Collections.sort(list);
        
        for(int i=0; i<list.size(); i++){
            answer+= list.get(i);
        }
        return answer;
    }
}