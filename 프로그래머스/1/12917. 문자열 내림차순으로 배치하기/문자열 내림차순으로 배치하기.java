import java.util.*;

class Solution {
    public String solution(String s) {
        String []ans = s.split("");
        Arrays.sort(ans,Collections.reverseOrder());
        String answer="";
        answer = String.join("", ans);
        return answer;
    }
}