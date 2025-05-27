import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int num : arr){
            list.add(num);
        }
        int x=list.indexOf(2);
        int y=list.lastIndexOf(2);

        if(x==-1) return new int[]{-1};
        return Arrays.copyOfRange(arr, x, y + 1);
    }
}