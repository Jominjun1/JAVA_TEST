import java.util.*;
class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        if(n == 1){
            return Arrays.copyOfRange(num_list , 0 , slicer[1]+1);
        }else if(n == 2){
            return Arrays.copyOfRange(num_list , slicer[0] , num_list.length);
        }else if(n == 3){
            return Arrays.copyOfRange(num_list , slicer[0] , slicer[1]+1);
        }else{
            int start = slicer[0];
            int end = slicer[1];
            int step = slicer[2];

            List<Integer> result = new ArrayList<>();
            for (int i = start; i <= end; i += step) {
                result.add(num_list[i]);
            }
            return result.stream().mapToInt(Integer::intValue).toArray();
        }
    }
}