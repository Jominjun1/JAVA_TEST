import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] a = {1,2,3,4,5};
        int[] b = {2,1,2,3,2,4,2,5};
        int[] c = {3,3,1,1,2,2,4,4,5,5};
        
        int x=0;
        int y=0;
        int z=0;
        for(int i=0; i< answers.length; i++){
            if(a[i % a.length] == answers[i]) x++;
            if(b[i % b.length] == answers[i]) y++;
            if(c[i % c.length] == answers[i]) z++;
        }
        int maxscore = Math.max(x,Math.max(y,z));
        ArrayList<Integer> list= new ArrayList<>();
        if(maxscore==x){list.add(1);}
        if(maxscore==y){list.add(2);}
        if(maxscore==z){list.add(3);}
        
        int[] num = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            num[i] = list.get(i);
        }
        return num;
    }
}