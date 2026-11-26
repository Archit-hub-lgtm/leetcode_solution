class Solution {
    public boolean canAliceWin(int n) {
        int stones = 10;

        while(n >= stones) {
            n -= stones;
            stones--;
        }

        if(stones % 2 != 0 && stones > 0) {
            return true;
        } else {
            return false;
        }
    }
}