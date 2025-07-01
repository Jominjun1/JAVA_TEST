import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        HashSet<Integer> hash = new LinkedHashSet<>();
        for(int i : arr){
            hash.add(i);
        }
        int [] answer = new int[k];
        Iterator<Integer> iter = hash.iterator();
        for(int i=0; i<k; i++){
            if (iter.hasNext()){
                answer[i] = iter.next();
            }else{
                answer[i] = -1;
            }
        }
        return answer;
    }
}