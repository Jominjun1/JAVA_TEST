import java.util.HashMap;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }
        for(int i=0; i<callings.length; i++){
            int index = map.get(callings[i]);
            if (index > 0) {
                String temp = players[index - 1];
                players[index - 1] = players[index];
                players[index] = temp;
                map.put(players[index], index);
                map.put(players[index - 1], index - 1);
            }   
        }
        return players;
    }
}