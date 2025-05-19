import java.util.*;
class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int cnt=0;
        LinkedList<String> list = new LinkedList<>();
        if(cacheSize == 0){
            answer = 5 * cities.length;
            return answer;
        }
        for(int i=0; i<cities.length; i++){
            String city = cities[i].toUpperCase();
            if(list.contains(city)){
                list.remove(city);
                list.add(city);
                answer +=1;
            }else if(list.size() < cacheSize){
                list.add(city);
                answer +=5;
            }else{
                list.remove(0);
                list.add(city);
                answer +=5;
            }
            
        }
        return answer;
    }
}