import java.util.*;
import java.math.*;
class Solution {
    public int[][] solution(int[][] arr) {
        if(arr[0].length == arr.length) return arr;
        int max = Math.max(arr[0].length , arr.length);
        int[][] answer = new int[max][max];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}