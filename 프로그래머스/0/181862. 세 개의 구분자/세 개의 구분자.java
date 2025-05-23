import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = myStr.replaceAll("[abc]" ," ").split(" ");
        List<String> list = new ArrayList<>();
        for(int i=0; i< answer.length; i++){
            if(!answer[i].equals("")){
                list.add(answer[i]);
            }
        }
        if(list.size() ==0){
            list.add("EMPTY");
        }
        return list.toArray(new String[0]);
    }
}