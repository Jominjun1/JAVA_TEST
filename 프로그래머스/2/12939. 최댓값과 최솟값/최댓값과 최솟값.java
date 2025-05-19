import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String[] ans = s.split(" ");
        int[] number = new int[ans.length];
        for(int i=0; i<ans.length; i++){
            number[i] = Integer.parseInt(ans[i]);
        }
        int max = Arrays.stream(number).max().getAsInt();  
        int min = Arrays.stream(number).min().getAsInt(); 

        return min + " " + max;
    }
}