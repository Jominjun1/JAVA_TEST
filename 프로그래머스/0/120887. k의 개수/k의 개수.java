class Solution {
    int answer = 0;
    public void find(int i , int target){
        String [] str = String.valueOf(i).split("");
        for(int x=0; x<str.length; x++){
            if(Integer.parseInt(str[x]) == target){
                answer++;
            }
        }
    }
    public int solution(int i, int j, int k) {
        for(int x=i; x<=j; x++){
            find(x , k);
        }
        return answer;
    }
}