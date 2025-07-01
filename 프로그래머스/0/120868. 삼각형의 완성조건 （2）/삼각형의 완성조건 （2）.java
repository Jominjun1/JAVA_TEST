import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int x = Math.min(sides[0] , sides[1]);
        int y = (sides[0] + sides[1]-1) - Math.max(sides[0] , sides[1]);
        
        return x+y;
    }
}