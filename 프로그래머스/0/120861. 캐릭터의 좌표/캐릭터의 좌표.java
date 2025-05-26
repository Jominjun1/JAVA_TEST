class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int x=0; int y =0;
        for(int i=0; i<keyinput.length; i++){
            switch(keyinput[i]){
            case "left":
                if(x*-1== board[0]/2) break;
                x--;
                break;
            case "right":
                if(x == board[0]/2) break;
                x++;
                break;
            case "up":
                if(y == board[1]/2) break;
                y++;
                break;
            case "down":
                if(y*-1 == board[1]/2) break;
                y--;
                break;
            }
        }
        int [] answer = new int[2];
        answer[0] = x;
        answer[1] = y;
        return answer;
    }
}