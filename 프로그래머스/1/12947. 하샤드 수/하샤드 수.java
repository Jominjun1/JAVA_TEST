class Solution {
    public boolean solution(int x) {
        int z=0;
        int a=x;
        while(0 < x){
            int y = x%10;
            z+=y;
            x /= 10;
        }
        System.out.print(z);
        if(a % z == 0)
            return true;
        else 
            return false;
    }
}