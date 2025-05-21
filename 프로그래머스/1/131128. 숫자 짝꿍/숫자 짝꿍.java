import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int [] c1 = new int[10];
        int [] c2 = new int[10];
        for(int i=0; i<X.length(); i++){
            c1[X.charAt(i)-'0']++;
        }
        for(int i=0; i<Y.length(); i++){
            c2[Y.charAt(i)-'0']++;
        }
        StringBuilder s = new StringBuilder();
        for(int i=9; i>=0; i--){
            int min=Math.min(c1[i],c2[i]);
            for(int j=0; j<min; j++) {
                s.append(i);
            }
        }
        if(s.length() == 0) return "-1";
        if(s.toString().startsWith("0")) return "0";

        return s.toString();
    }
}