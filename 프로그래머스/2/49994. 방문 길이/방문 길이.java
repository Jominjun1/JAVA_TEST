import java.util.*;
class Solution {
    public int solution(String dirs) {
        int x =0,y=0;
        HashSet<String> path = new HashSet<>();
        for(int i=0; i<dirs.length(); i++){
            int nx = x, ny = y;
            switch(dirs.charAt(i)){
                case 'U': ny+= 1; break;
                case 'L': nx-= 1; break;
                case 'R': nx+= 1; break;
                case 'D': ny-= 1; break;
            }
            if(nx < -5 || ny< -5 || nx>5 || ny>5) continue;
            path.add(x+""+y+nx+""+ny);
            path.add(nx+""+ny+x+""+y);
            x=nx;
            y=ny;
        }
        return path.size()/2;
    }
}