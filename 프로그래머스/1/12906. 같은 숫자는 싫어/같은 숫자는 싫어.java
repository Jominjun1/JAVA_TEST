import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.offer(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(arr[i-1] != arr[i]){
                queue.offer(arr[i]);
            }
        }
        int [] numb= new int[queue.size()];
        for(int i=0; i<numb.length; i++){
            numb[i] = queue.poll();
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return numb;
    }
}