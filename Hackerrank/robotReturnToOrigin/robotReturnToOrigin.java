package Hackerrank.robotReturnToOrigin;

class Solution {
    public boolean judgeCircle(String moves) {
         if ( (moves.length() & 1) != 0) return false;

        int x =0,y =0;
        for(char move: moves.toCharArray()){
            if(move=='U'){
                y++;
            } else if (move=='D'){
                y--;
            } else if (move=='L'){
                x--;
            } else{
                x++;
            }
        }
        return x==0 & y==0;
    }
}