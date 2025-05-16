import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String,Integer> maps = new LinkedHashMap<>();
        for(int i=0; i<name.length; i++){
            maps.put(name[i] , yearning[i]);
        }
        int[] answer = new int[photo.length];
        for(int i=0; i<photo.length; i++){
            int score=0;
            for(int j=0; j<photo[i].length; j++){
                String s= photo[i][j];
                 if(maps.containsKey(s)){ 
                    score+=maps.get(s);
                }
            }
            answer[i] = score;
        }
        return answer;
    }
}