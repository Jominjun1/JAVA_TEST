import java.util.*;
class Solution {
    public String[] solution(String[] str_list) {
        int a = Arrays.asList(str_list).indexOf("l");
        int b = Arrays.asList(str_list).indexOf("r");
        if(a == -1&&b == -1){
            return new String[0];
        }
        if(a != -1&&(b == -1 || a<b)){
            return Arrays.copyOfRange(str_list, 0, a);
        }
        if(b != -1&&(a == -1 || b<a)){
            return Arrays.copyOfRange(str_list, b + 1, str_list.length);
        }
        return new String[0];
    }
}