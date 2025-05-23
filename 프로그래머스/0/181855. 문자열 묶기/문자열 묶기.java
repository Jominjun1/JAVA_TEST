import java.util.*;
class Solution {
    public int solution(String[] strArr) {
        HashMap<Integer , Integer> hash = new HashMap<>();
         for (String s : strArr) {
            int len = s.length();
            hash.merge(len, 1, Integer::sum);
        }
        return Collections.max(hash.values());
    }
}